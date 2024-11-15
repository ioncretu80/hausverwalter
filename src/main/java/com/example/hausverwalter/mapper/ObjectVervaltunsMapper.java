package com.example.hausverwalter.mapper;

import com.example.hausverwalter.dto.DtoObject;
import com.example.hausverwalter.entity.EntityObject;
import org.mapstruct.Mapper;



@Mapper
public interface ObjectVervaltunsMapper {

  DtoObject entityObjectToDtoObject(EntityObject entityObject);

  EntityObject dtoObjectToEntityObject(DtoObject dtoObject);

}
