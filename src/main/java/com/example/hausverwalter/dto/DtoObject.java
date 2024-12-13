package com.example.hausverwalter.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoObject {
  private Long id;
  private String objectName;
  private String street;
  private String hausNumber;
  private String postCode;
  private String city;
  private List<DtoApartment> apartments;
}
