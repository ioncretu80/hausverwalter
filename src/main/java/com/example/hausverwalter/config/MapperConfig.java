package com.example.hausverwalter.config;

import com.example.hausverwalter.mapper.ObjectVervaltunsMapper;
import com.example.hausverwalter.mapper.ObjectVervaltunsMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
  @Bean
  public ObjectVervaltunsMapper objectVervaltunsMapper() {
    return new ObjectVervaltunsMapperImpl();
  }
}
