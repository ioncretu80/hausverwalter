package com.example.hausverwalter.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "objects")
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

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getObjectName() {
  return objectName;
 }

 public void setObjectName(String objectName) {
  this.objectName = objectName;
 }

 public String getStreet() {
  return street;
 }

 public void setStreet(String street) {
  this.street = street;
 }

 public String getHausNumber() {
  return hausNumber;
 }

 public void setHausNumber(String hausNumber) {
  this.hausNumber = hausNumber;
 }

 public String getPostCode() {
  return postCode;
 }

 public void setPostCode(String postCode) {
  this.postCode = postCode;
 }

 public String getCity() {
  return city;
 }

 public void setCity(String city) {
  this.city = city;
 }

 public EntityObject() {
 }
}
