package com.example.hausverwalter.mapper;

import com.example.hausverwalter.dto.DtoObject;
import com.example.hausverwalter.entity.EntityObject;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ObjectVerwaltungsMapper {

  //  @Mapping( source = "apartments" ,target = "apartments", ignore = true)
  @Mapping(target = "apartments", ignore = true)
  DtoObject entityObjectToDtoObject(EntityObject entityObject);

  EntityObject dtoObjectToEntityObject(DtoObject dtoObject);
}
