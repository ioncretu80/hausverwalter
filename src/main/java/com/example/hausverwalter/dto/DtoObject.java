package com.example.hausverwalter.dto;


import lombok.Data;

@Data
public class DtoObject
{
  private Long id;
  private String objectName;
  private String street;
  private String hausNumber;
  private String postCode;
  private String city;

}
