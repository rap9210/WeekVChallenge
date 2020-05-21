package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class HomeController {

    private ArrayList<Customer> dogOwners = new ArrayList<>();
    private ArrayList<Customer> catOwners = new ArrayList<>();

    @RequestMapping("/Home")
    public String loadHomePage(){
        return "Home";
    }

    @GetMapping("/dogform")
    public String loadDogForm(Model model){
        model.addAttribute("customer", new Customer());
        return "dogform";
    }

    @PostMapping("/doglist")
    public String confirmDog(@Valid Customer customer, BindingResult result, Model model){

        if(result.hasErrors()){
            return "dogform";
        }
        dogOwners.add(customer);
        model.addAttribute("dogOwners", dogOwners);
        return "doglist";
    }

    @GetMapping("/catform")
    public String loadCatForm(Model model){
        model.addAttribute("customer", new Customer());
        return "catform";
    }

    @PostMapping("/catlist")
    public String confirmCat(@Valid Customer customer, BindingResult result, Model model){
        if(result.hasErrors()){
            return "catform";
        }
        catOwners.add(customer);
        model.addAttribute("catOwners", catOwners);
        return "catlist";
    }

    @RequestMapping("/doglistview")
    public String loadDogOwners(){
        return "doglistview";
    }
    @RequestMapping("/catlistview")
    public String loadCatOwners(){
        return "catlistview";
    }



}
