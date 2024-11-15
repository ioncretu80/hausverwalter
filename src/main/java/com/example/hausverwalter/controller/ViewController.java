package com.example.hausverwalter.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
  public class ViewController {
  @GetMapping("/view-products")
  public String viewProducts() {
    return "view-products";
  }
  @GetMapping("/add-products")
  public String addProducts() {
    return "add-products";
  }

  @GetMapping("/locale")
  public String locale() {
    return "locale";
  }

  @GetMapping("/objects")
  public String objects(Model model) {
    // Poți adăuga atribute pentru Thymeleaf
    return "object_list"; // Aceasta va trimite utilizatorul către home.html
  }

  @GetMapping("/orders")
  public String order(Model model) {
    // Poți adăuga atribute pentru Thymeleaf
    return "order_list"; // Aceasta va trimite utilizatorul către home.html
  }

}



