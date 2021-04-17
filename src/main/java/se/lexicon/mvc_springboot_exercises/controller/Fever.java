package se.lexicon.mvc_springboot_exercises.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Fever {
    @GetMapping("/feverHome")
    public String FeverPage(){
        return "FeverHome";
    }
    @PostMapping("/feverHome")
    public String TemperatureSubmit(TempService temp,Model model){
        return "FeverHome";
    }

}
