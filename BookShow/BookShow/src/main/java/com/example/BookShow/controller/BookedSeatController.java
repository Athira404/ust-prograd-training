//package com.example.BookShow.controller;
//
//import com.example.BookShow.entity.BookedSeats;
//import com.example.BookShow.entity.Seat;
//import com.example.BookShow.service.BookedSeatService;
//import com.example.BookShow.service.MovieShowService;
//import com.example.BookShow.service.SeatService;
//import com.example.BookShow.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Objects;
//
//@Controller
//public class BookedSeatController {
//    @Autowired
//    private BookedSeatService bookedSeatService;
//    @Autowired
//    private SeatService seatService;
//    @Autowired
//    private MovieShowService movieShowsService;
//    @Autowired
//    private UserService customerService;
//
//
//    @GetMapping("/{userName}/seats/{id}")
//    public String seats(@PathVariable String userName, @PathVariable Long id, Model model) {
//        model.addAttribute("shows", id);
//        model.addAttribute("userName", userName);
//        return "seats";
//    }
//
//    @GetMapping("/{userName}/booked/{shows}")
//    public String booked(@PathVariable String userName, @PathVariable Long shows, Model model) {
//        model.addAttribute("userName",userName);
//        model.addAttribute("shows", shows);
//        return "booked";
//    }
//
//    @PostMapping("/{userName}/booked/{shows}")
//    public String seatBooked(@PathVariable String userName, @PathVariable Long shows, HttpServletRequest request, Model model) {
//        String bookSeats = request.getParameter("bookedSeats");
//        String[] bookedSeat = bookSeats.split(",");
//        for (String seat : bookedSeat) {
//            BookedSeats bookedSeats = bookedSeatService.getBySeatsAndMovieShowsId(seat,shows);
//            if (!(Objects.isNull(bookedSeats))){
//                model.addAttribute("message", bookSeats + " Seat is already booked. Please choose another seat");
//                return "seats";
//            }
//        }
//        for (String seat : bookedSeat) {
//            BookedSeats bookedSeats = bookedSeatService.getBySeatsAndMovieShowsId(seat, shows);
//            Seat seats = seatService.getBySeats(seat);
//            BookedSeats bookedSeats1 = new BookedSeats(seats.getSeats(), seats.getPrice());
//            bookedSeats1.setMovieShows(movieShowsService.getById(shows));
//            bookedSeats1.setCustomer(customerService.findUserByUserName(userName));
//            bookedSeatService.saveSeat(bookedSeats1);
//        }
//        return "booked";
//    }
//
//    @GetMapping("/{userName}/myBookings")
//    public String myBookings(@PathVariable String userName, Model model){
//        model.addAttribute("userName", bookedSeatService.findByCustomerUserName(userName));
//        return "myBookings";
//    }
//
//
//
//}
