package com.example.hausverwalter.service;

import com.example.hausverwalter.dto.DtoApartment;
import com.example.hausverwalter.dto.DtoObject;
import com.example.hausverwalter.entity.EntityApartment;
import com.example.hausverwalter.entity.EntityObject;
import com.example.hausverwalter.mapper.ApartmentMapper;
import com.example.hausverwalter.mapper.ObjectVerwaltungsMapper;
import com.example.hausverwalter.repos.ObjectVRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ObjectVService {

  private final ObjectVRepository objectVRepository;
  private final ObjectVerwaltungsMapper objectVervaltunsMapper;
  private final ApartmentMapper apartmentMapper;

  public List<DtoObject> getAllObjects() {

    List<EntityObject> list = objectVRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    if (list.isEmpty()) {
      return new ArrayList<>();
    }

    return list.stream()
        .map(
            entityObject -> {
              DtoObject dtoObject = objectVervaltunsMapper.entityObjectToDtoObject(entityObject);

              List<DtoApartment> apartmentDtoList =
                  entityObject.getApartments().stream()
                      .map(apartment -> apartmentMapper.toDto(apartment))
                      .collect(Collectors.toList());
              dtoObject.setApartments(apartmentDtoList);
              return dtoObject;
            })
        .collect(Collectors.toList());
  }

  public void deleteVObject(Long id) {
    log.info("deleteVObject with id {}", id);
    objectVRepository.deleteById(id);
  }

  public void addVObject(DtoObject dtoObject) {
    EntityObject entityObject = objectVervaltunsMapper.dtoObjectToEntityObject(dtoObject);
    objectVRepository.save(entityObject);
  }

  public DtoObject getObjectById(Long id) {
    EntityObject entityObject = objectVRepository.findById(id).get();

    List<EntityApartment> entityApartmentsList = entityObject.getApartments();
    List<DtoApartment> dtoApartmentsList =
        entityApartmentsList.stream().map(apartmentMapper::toDto).collect(Collectors.toList());

    DtoObject objectDto = objectVervaltunsMapper.entityObjectToDtoObject(entityObject);
    objectDto.setApartments(dtoApartmentsList);

    return objectDto;
  }
}
