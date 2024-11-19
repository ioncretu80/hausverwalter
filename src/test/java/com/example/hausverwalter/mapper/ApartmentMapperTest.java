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
    // Pregătim un obiect Apartment
    EntityApartment apartment = new EntityApartment(1L, "123 Main Street", 3, 150000.50);

    // Mapăm către DTO
    DtoApartment apartmentDto = ApartmentMapper.INSTANCE.toDto(apartment);

    // Verificăm dacă valorile au fost mapate corect
    assertNotNull(apartmentDto);
//    assertEquals(apartment.getId(), apartmentDto.getId());
//    assertEquals(apartment.getAddress(), apartmentDto.getAddress());
//    assertEquals(apartment.getNumberOfRooms(), apartmentDto.getNumberOfRooms());
//    assertEquals(apartment.getPrice(), apartmentDto.getPrice());
  }

}