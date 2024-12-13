package com.example.hausverwalter.mapper;

import static org.junit.jupiter.api.Assertions.*;

import com.example.hausverwalter.dto.DtoApartment;
import com.example.hausverwalter.entity.EntityApartment;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class ApartmentMapperTest {

  @Test
  void testEntityToDtoMapping() {

    EntityApartment apartment = new EntityApartment();
    apartment.setId(1L);
    apartment.setDesignation("TestApartment");
    apartment.setRentedSpace(100.0);
    apartment.setShot("TestShot");
    apartment.setFloor("TestFloor");
    apartment.setNumberOfRooms(3);
    apartment.setMake("TestMake");

    DtoApartment apartmentDto = ApartmentMapper.INSTANCE.toDto(apartment);

    assertNotNull(apartmentDto);
    assertEquals(apartment.getId(), apartmentDto.getId());
    assertEquals(apartment.getDesignation(), apartmentDto.getDesignation());
    assertEquals(apartment.getRentedSpace(), apartmentDto.getRentedSpace());
    assertEquals(apartment.getShot(), apartmentDto.getShot());
    assertEquals(apartment.getFloor(), apartmentDto.getFloor());
    assertEquals(apartment.getNumberOfRooms(), apartmentDto.getNumberOfRooms());
    assertEquals(apartment.getMake(), apartmentDto.getMake());
  }

  @Test
  void testDtoToEntity() {
    // Pregătim un obiect ApartmentDto
    DtoApartment apartmentDto = new DtoApartment();
    apartmentDto.setId(1L);
    apartmentDto.setDesignation("TestApartment");
    apartmentDto.setRentedSpace(100.0);
    apartmentDto.setShot("TestShot");
    apartmentDto.setFloor("TestFloor");
    apartmentDto.setNumberOfRooms(3);
    apartmentDto.setMake("TestMake");

    EntityApartment apartment = ApartmentMapper.INSTANCE.toEntity(apartmentDto);

    assertNotNull(apartment);
    assertEquals(apartmentDto.getId(), apartment.getId());
    assertEquals(apartmentDto.getDesignation(), apartment.getDesignation());
    assertEquals(apartmentDto.getRentedSpace(), apartment.getRentedSpace());
    assertEquals(apartmentDto.getShot(), apartment.getShot());
    assertEquals(apartmentDto.getFloor(), apartment.getFloor());
    assertEquals(apartmentDto.getNumberOfRooms(), apartment.getNumberOfRooms());
    assertEquals(apartmentDto.getMake(), apartment.getMake());
  }
}
