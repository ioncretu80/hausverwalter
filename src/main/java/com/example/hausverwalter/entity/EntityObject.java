package com.example.hausverwalter.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.ToString;

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

  @OneToMany(mappedBy = "object", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JsonManagedReference
  @ToString.Exclude
  private List<EntityApartment> apartments;

  public void addApartment(EntityApartment apartment) {
    if (apartments == null) {
      apartments = new ArrayList<>();
    }
    apartments.add(apartment);
    apartment.setObject(this);
  }
}
