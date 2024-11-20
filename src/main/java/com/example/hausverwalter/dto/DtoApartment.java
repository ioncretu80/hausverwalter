package com.example.hausverwalter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoApartment {
  private Long id;
  private String designation;
  private double rentedSpace;
  private int numberOfRooms;
  private String shot; //grund floor, upper floor, attic
  private String floor;
  private String make;//links-links, links, rechts, rechts-rechts, mitte
}

