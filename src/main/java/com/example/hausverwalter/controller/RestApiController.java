package com.example.hausverwalter.controller;

import com.example.hausverwalter.dto.DtoObject;
import com.example.hausverwalter.service.ObjectVService;
import jakarta.websocket.server.PathParam;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@Slf4j
public class RestApiController {

  private final ObjectVService objectVService;

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


  @GetMapping("/vobjects")
  public List<DtoObject> getVObjects() {
    System.out.println("getVObjects");
    return objectVService.getAllObjects();
  }
  @GetMapping("/vobjects/{id}")
  public DtoObject getVObjectsByIndex(@PathVariable Long id) {
    log.info("getVObjectsbyIndex with path variable {}", id);
    return objectVService.getObjectById(id);
  }

  @PostMapping("/vobjects/save")
  public void addVObject(@RequestBody DtoObject dtoObject) {
    objectVService.addVObject(dtoObject);
  }

  @DeleteMapping("/vobjects/delete/{id}")
  public void deleteVObject(@PathVariable Long id) {
    objectVService.deleteVObject(id);
  }
}
