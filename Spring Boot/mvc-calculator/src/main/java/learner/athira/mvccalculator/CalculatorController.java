package learner.athira.mvccalculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {
    @RequestMapping("/")
    public String calculator(){
        return "home";
    }
}
