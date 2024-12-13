package com.example.hausverwalter.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity(name = "apartments")
@Table(name = "apartments")
@Data
public class EntityApartment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String designation;
  private double rentedSpace;
  private int numberOfRooms;
  private String shot; // grund floor, upper floor, attic
  private String floor;
  private String make; // links-links, links, rechts, rechts-rechts, mitte

  @ManyToOne(fetch = FetchType.LAZY)
  @JsonBackReference
  @ToString.Exclude
  private EntityObject object;
}
