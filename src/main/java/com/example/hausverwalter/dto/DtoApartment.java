package com.example.hausverwalter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoApartment {
  private Long id;
  private String address;
  private int numberOfRooms;
  private double price;
}

