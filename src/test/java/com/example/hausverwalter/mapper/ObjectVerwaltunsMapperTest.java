package com.example.hausverwalter.mapper;

import static org.junit.jupiter.api.Assertions.*;

import com.example.hausverwalter.dto.DtoObject;
import com.example.hausverwalter.entity.EntityApartment;
import com.example.hausverwalter.entity.EntityObject;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class ObjectVerwaltungsMapperTest {

  @Autowired
  private ObjectVerwaltungsMapper objectVervaltunsMapper;

  @Test
  void entityObjectToDtoObject() {

    EntityObject entityObject = new EntityObject();
    entityObject.setId(1L);
    entityObject.setObjectName("TestObject");
    entityObject.setStreet("TestStreet");
    entityObject.setHausNumber("TestHausNumber");
    entityObject.setPostCode("TestPostCode");
    entityObject.setCity("TestCity");

    EntityApartment apartment1 = new EntityApartment();
    apartment1.setId(1L);
    apartment1.setObject(entityObject);

    EntityApartment apartment2 = new EntityApartment();
    apartment2.setId(2L);
    apartment2.setObject(entityObject);


    List<EntityApartment> apatments = List.of(apartment1, apartment2);

    entityObject.setApartments(apatments);


    DtoObject dtoObject = objectVervaltunsMapper.entityObjectToDtoObject(entityObject);

    assertEquals(entityObject.getId(), dtoObject.getId());
    assertEquals(entityObject.getObjectName(), dtoObject.getObjectName());
    assertEquals(entityObject.getStreet(), dtoObject.getStreet());
    assertEquals(entityObject.getHausNumber(), dtoObject.getHausNumber());
    assertEquals(entityObject.getPostCode(), dtoObject.getPostCode());
    assertEquals(entityObject.getCity(), dtoObject.getCity());
    assertNull(dtoObject.getApartments());


  }
}