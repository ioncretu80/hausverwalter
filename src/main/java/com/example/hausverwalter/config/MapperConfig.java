package com.example.hausverwalter.config;

import com.example.hausverwalter.mapper.ApartmentMapper;
import com.example.hausverwalter.mapper.ApartmentMapperImpl;
import com.example.hausverwalter.mapper.ObjectVerwaltungsMapper;

import com.example.hausverwalter.mapper.ObjectVerwaltungsMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
  @Bean
  public ObjectVerwaltungsMapper objectVerwaltungsMapper() {
    return new ObjectVerwaltungsMapperImpl();
  }

  @Bean
  public ApartmentMapper apartmentMapper() {
    return new ApartmentMapperImpl();
  }
}
