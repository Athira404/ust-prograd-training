package learner.athira.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MvcController {

    @RequestMapping("/")
//    @ResponseBody --> To return string instead of html file
    public String index() {
        return "home";//-->search html file in templates
    }

    @RequestMapping("/dynamic")
    public String dynamic(Model model){
        int a = 10;
        model.addAttribute("var", a);
        return "dynamic";
    }

    @RequestMapping("/add")
    public String add(){
        return "add";
    }

    @RequestMapping("/result")
    public String result(Model model, HttpServletRequest req){
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        System.out.println(num1);
        System.out.println(num2);
        int res = num1 + num2;
        model.addAttribute("result", res);
        return "result";
    }
}
