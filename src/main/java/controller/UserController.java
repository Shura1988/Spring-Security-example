package controller;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class UserController {
    @GetMapping("/")
    public String index(Model model, Principal principal) {
        model.addAttribute("message", "You are logged in as " + principal.getName());
        return "index";
    }

//    @GetMapping("/user")
//    public String user(Principal principal){
//        System.out.println(principal.getName());
//        return "user";
//    }
//
//    @GetMapping("/admin")
//    public String admin(){
//        SecurityContext context = SecurityContextHolder.getContext();
//        System.out.println(context.getAuthentication().getName());
//        return "admin";
//    }
}
