package spring.cuneiform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LearnController {
    
    @RequestMapping("/learn")
    public String learn(Model model) {
        return "learn/game";
    }

}
