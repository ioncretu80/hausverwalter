package com.example.hausverwalter.service;

import com.example.hausverwalter.dto.DtoApartment;
import com.example.hausverwalter.dto.DtoObject;
import com.example.hausverwalter.entity.EntityApartment;
import com.example.hausverwalter.mapper.ApartmentMapper;
import com.example.hausverwalter.mapper.ObjectVerwaltungsMapper;
import com.example.hausverwalter.repos.ApartmentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ApartmentService {
  private final ApartmentRepository apartmentRepository;
  private final ApartmentMapper apartmentMapper;
  private final ObjectVerwaltungsMapper objectMapper;

  public List<DtoApartment> getAllApartments() {
    log.info("Get all apartments");

    List<EntityApartment> result = apartmentRepository.findAll();

    return result.stream().map(apartmentMapper::toDto).toList();


  }

  public DtoApartment getApartmentById(Long id) {

    Optional<EntityApartment> result = apartmentRepository.findById(id);
    DtoApartment dtoApartment = apartmentMapper.toDto(result.get());
    return dtoApartment;
  }
}
