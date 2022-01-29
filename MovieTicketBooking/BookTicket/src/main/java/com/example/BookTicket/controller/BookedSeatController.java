package com.example.BookTicket.controller;

import com.example.BookTicket.entity.BookedSeats;
import com.example.BookTicket.entity.Seats;
import com.example.BookTicket.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class BookedSeatController {
    @Autowired
    private BookedSeatsService bookedSeatsService;

    @Autowired
    private MovieService movieService;

    @Autowired
    private UserService userService;

    @Autowired
    private SeatsService seatsService;

    @Autowired
    private MovieShowsService movieShowsService;

    @GetMapping("/{userName}/seats/{id}")
    public String seats(@PathVariable String userName, @PathVariable Long id, Model model){
        model.addAttribute("userName", userName);
        model.addAttribute("shows", id);
        return "seats";
    }
    @GetMapping("/{userName}/booked/{shows}")
    public String booked(@PathVariable String userName, @PathVariable Long shows, Model model) {
        model.addAttribute("userName", userName);
        model.addAttribute("shows", shows);
        return "booked";
    }

    @PostMapping("/{userName}/booked/{shows}")
    public String seatBooked(@PathVariable String userName, @PathVariable Long shows, HttpServletRequest request, Model model) {
        String bookSeats = request.getParameter("bookedSeats");
        String[] bookedSeat = bookSeats.split(",");
        for (String seat : bookedSeat) {
            BookedSeats bookedSeats = bookedSeatsService.getBySeatAndMovieShowsId(seat, shows);
            if (!(Objects.isNull(bookedSeats))) {
                model.addAttribute("message", bookSeats + " Seat is already booked. Please choose another seat");
                return "seats";
            }
        }
        for (String seat : bookedSeat) {
            Seats seats = seatsService.getBySeats(seat);
            BookedSeats bookedSeats = new BookedSeats(seats.getSeat(), seats.getPrice());
            bookedSeats.setMovieShows(movieShowsService.getById(shows));
            bookedSeats.setUser(userService.findUserByUserName(userName));
            bookedSeatsService.saveSeat(bookedSeats);
        }
        return "booked";
    }

    @GetMapping("/{userName}/myBookings")
    public String myBookings(@PathVariable String userName, Model model) {
        model.addAttribute("userName", bookedSeatsService.findUserByUserName(userName));
        return "myBookings";
    }
}
