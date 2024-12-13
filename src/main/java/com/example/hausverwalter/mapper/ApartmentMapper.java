package com.example.hausverwalter.mapper;

import com.example.hausverwalter.dto.DtoApartment;
import com.example.hausverwalter.entity.EntityApartment;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ApartmentMapper {

  ApartmentMapper INSTANCE = Mappers.getMapper(ApartmentMapper.class);

  @Mapping(source = "object", target = "object", ignore = true)
  DtoApartment toDto(EntityApartment apartment);

  EntityApartment toEntity(DtoApartment dto);
}
