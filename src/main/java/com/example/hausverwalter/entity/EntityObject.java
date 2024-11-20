package com.example.hausverwalter.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "objects")
@Data
 public class EntityObject {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;
  @Column(name = "object_name", nullable = false)
  private String objectName;
  private String street;
  @Column(name = "haus_number")
  private String hausNumber;
  @Column(name = "post_code")
  private String postCode;
  private String city;


}
