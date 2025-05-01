package  com.ejercicio.springnott.web.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import  com.ejercicio.springnott.web.springboot_web.controllers.models.User;

@Controller
public class UserController {
    @GetMapping("/lista")
    public String lista(ModelMap model) {
        List<User> user = Arrays.asList(
            new User("Esmeralda","Somoza", "esme@servidor"),
            new User("Alex","Hernandez", "ale@servidor"),
            new User("Maury","Palacios", "maury@servidor")
        );
        model.addAttribute("user", user);
        model.addAttribute("title","Lista de usuarios");
        return "lista";
    }  
}