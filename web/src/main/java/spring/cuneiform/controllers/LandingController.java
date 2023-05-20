package spring.cuneiform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingController {
    
    @RequestMapping("/")
    public String landing(Model model) {

        String TITLE = "cuneiform";
        String ACTIVE = "Home";

        model.addAttribute("ACTIVE", ACTIVE);
        model.addAttribute("TITLE", TITLE);
        return "index";
    }
}
