package project_wp.controller;

import project_wp.model.Property;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PropertyController {

    @GetMapping("/properties")
    public String properties(Model model) {

        List<Property> properties = List.of(
                new Property("Casa Calima", 20),
                new Property("La Comarca de Veratton", 26)
        );

        model.addAttribute("properties", properties);

        return "properties";
    }
}
