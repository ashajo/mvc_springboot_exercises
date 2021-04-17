package se.lexicon.mvc_springboot_exercises.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home {
    List<String>store=new ArrayList<String>();
    String contact=null;

    @RequestMapping("/index")
    public String Index(){
        return "index";
    }


    @GetMapping("/contact")
    public String Contact(){
        return "contact";

    }
    @PostMapping("/contact")
    public String addContact(@RequestParam(value = "contact")String contact, Model model){
        store.add(contact);
        return "redirect:/contact";
        }
        @RequestMapping(value = "/contact/contact",method = RequestMethod.GET)
        public String Listofcontacts(Model model){
        model.addAttribute("contacts",store);
        return "contact";
        }


    @GetMapping("/about")
    public String About(){
        return "about";
    }


}
