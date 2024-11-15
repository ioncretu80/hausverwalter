package com.example.hausverwalter.dto;

public class DtoObject
{
  private Long id;
  private String objectName;
  private String street;
  private String hausNumber;
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

  public DtoObject() {
  }
}
