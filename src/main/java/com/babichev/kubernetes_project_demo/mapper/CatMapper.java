package com.babichev.kubernetes_project_demo.mapper;

import com.babichev.kubernetes_project_demo.dto.CatDTO;
import com.babichev.kubernetes_project_demo.entity.Cat;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = CatDTO.class)
public interface CatMapper {
    CatMapper CAT_MAPPER = Mappers.getMapper(CatMapper.class);

    CatDTO fromCat(Cat cat);

    @InheritInverseConfiguration
    Cat fromCatDTO(CatDTO catDTO);
}
