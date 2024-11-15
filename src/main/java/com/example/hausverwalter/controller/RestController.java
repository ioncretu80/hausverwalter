package com.example.hausverwalter.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/products")
  public String getProducts() {
    try {
      // Calea către fișierul JSON (relativă sau absolută)
      String filePath = "src/main/resources/json/getProducts_init.json";

      // Citește conținutul fișierului
      String content = Files.readString(Paths.get(filePath));

      return content;
    } catch (IOException e) {
      e.printStackTrace();
      return "Eroare la citirea fișierului JSON.";
    }

  }

  @PostMapping("/products")
  public String addProducts() {
    try {
      // Calea către fișierul JSON (relativă sau absolută)
      String filePath = "src/main/resources/json/getProducts_final.json";

      // Citește conținutul fișierului
      String content = Files.readString(Paths.get(filePath));

      return content;
    } catch (IOException e) {
      e.printStackTrace();
      return "Eroare la citirea fișierului JSON.";
    }

  }




}
