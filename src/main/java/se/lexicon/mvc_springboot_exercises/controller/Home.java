package se.lexicon.mvc_springboot_exercises.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home {
    List<String>StringList;

    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact";

    }
    @PostMapping("/contact")
    public String contact(@RequestParam(name = "new contact")String newContact, Model model){
        if(StringList==null){
            StringList=new ArrayList<>();
        }
        StringList.add(newContact);
        String Message="newContact added";
        model.addAttribute("message",Message);
        return "contct";
    }
    @GetMapping("/contactList")
    public String contactList(Model model){
        if (StringList==null){
            StringList=new ArrayList<>();

        }
        model.addAttribute("StringList",StringList);
        return "contactList";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
