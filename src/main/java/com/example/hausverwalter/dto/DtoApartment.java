package com.example.hausverwalter.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
  private DtoObject object;
}

