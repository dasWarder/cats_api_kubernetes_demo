package com.babichev.kubernetes_project_demo.mapper;

import com.babichev.kubernetes_project_demo.dto.CatDTO;
import com.babichev.kubernetes_project_demo.entity.Cat;
import org.mapstruct.Mapper;

import java.util.List;


public interface CatMapper {

    CatDTO fromCat(Cat cat);

    List<CatDTO> fromCatList(List<Cat> catList);

    Cat fromCatDTO(CatDTO catDTO);

    List<Cat> fromCatDTOList(List<CatDTO> catDTOList);
}
