package com.example.hausverwalter.mapper;

import com.example.hausverwalter.dto.DtoApartment;
import com.example.hausverwalter.entity.EntityApartment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ApartmentMapper {

  ApartmentMapper INSTANCE = Mappers.getMapper(ApartmentMapper.class);

  DtoApartment toDto(EntityApartment apartment);

  EntityApartment toEntity(DtoApartment dto);
}
