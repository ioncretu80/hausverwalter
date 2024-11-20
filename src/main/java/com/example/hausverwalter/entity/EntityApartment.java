package com.example.hausverwalter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name = "apartments")
@Data
public class EntityApartment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String designation;
  private double rentedSpace;
  private int numberOfRooms;
  private String shot; //grund floor, upper floor, attic
  private String floor;
  private String make;//links-links, links, rechts, rechts-rechts, mitte


}