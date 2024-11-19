package com.example.hausverwalter.mapper;

import static org.junit.jupiter.api.Assertions.*;

import com.example.hausverwalter.dto.DtoObject;
import com.example.hausverwalter.entity.EntityObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class ObjectVerwaltunsMapperTest {

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

    DtoObject dtoObject = objectVervaltunsMapper.entityObjectToDtoObject(entityObject);

    assertEquals(entityObject.getId(), dtoObject.getId());
    assertEquals(entityObject.getObjectName(), dtoObject.getObjectName());
    assertEquals(entityObject.getStreet(), dtoObject.getStreet());
    assertEquals(entityObject.getHausNumber(), dtoObject.getHausNumber());
    assertEquals(entityObject.getPostCode(), dtoObject.getPostCode());
    assertEquals(entityObject.getCity(), dtoObject.getCity());


  }
}