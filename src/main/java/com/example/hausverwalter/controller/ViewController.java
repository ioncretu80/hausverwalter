package com.example.hausverwalter.controller;


import com.example.hausverwalter.dto.DtoObject;
import com.example.hausverwalter.service.ObjectVService;
import java.util.ArrayList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequiredArgsConstructor
@Slf4j
  public class ViewController {

  private final   ObjectVService objectService;
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
    model.addAttribute("list", objectService.getAllObjects());
    return "object_list"; // Aceasta va trimite utilizatorul către objects.html
  }

  @PostMapping("/objects/delete/{id}")
  public String deleteObject(@PathVariable Long id) {
    objectService.deleteVObject(id);
    return "redirect:/objects";
  }

  @GetMapping("/objects/edit/{id}")
  public String getVObjectsByIndex(@PathVariable Long id,Model model) {
    log.info("getVObjectsbyIndex with path variable {}", id);
    DtoObject dtoObject = objectService.getObjectById(id);
    model.addAttribute("dtoObject",dtoObject);
    return  "object/edit";
  }

  @GetMapping("/objects/add")
  public String addObject() {
    return "object/add";
  }
  @PostMapping(value = "/objects/save", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public String saveVObject(@ModelAttribute DtoObject dtoObject) {
    objectService.addVObject(dtoObject);
    return "redirect:/objects";
  }


  @GetMapping("/objects/deteils/{id}")
  public String getVObjectDeteils(Model model, @PathVariable Long id) {
    ArrayList<String> app_liste = new ArrayList<>();

    model.addAttribute("dtoObject", objectService.getObjectById(id));
    model.addAttribute("app_liste", app_liste);
    return "object_detail";
  }


  @GetMapping("/orders")
  public String order(Model model) {
    return "order_list";
  }

}



