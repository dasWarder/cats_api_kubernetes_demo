package com.babichev.kubernetes_project_demo.mapper;

import com.babichev.kubernetes_project_demo.dto.CatDTO;
import com.babichev.kubernetes_project_demo.entity.Cat;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Component
public class MapperImpl implements CatMapper{
    @Override
    public CatDTO fromCat(Cat cat) {
        CatDTO catDTO = CatDTO.builder()
                .name(cat.getName())
                .birthDay(cat.getBirthDate()).build();

        return catDTO;
    }

    @Override
    public List<CatDTO> fromCatList(List<Cat> catList) {
        List<CatDTO> catDTOList = new ArrayList<>();

        catList.stream()
                .forEach(cat -> catDTOList.add(CatDTO.builder()
                        .name(cat.getName())
                        .birthDay(cat.getBirthDate()).build()));

        return catDTOList;
    }

    @Override
    public Cat fromCatDTO(CatDTO catDTO) {
        Cat cat = Cat.builder()
                .name(catDTO.getName())
                .birthDate(catDTO.getBirthDay())
                .createdAt(LocalDateTime.now()).build();

        return cat;
    }

    @Override
    public List<Cat> fromCatDTOList(List<CatDTO> catDTOList) {
        List<Cat> catList = new ArrayList<>();

        catDTOList.stream()
                .forEach(cat -> catList.add(Cat.builder()
                                                .name(cat.getName())
                                                .birthDate(cat.getBirthDay())
                                                .createdAt(LocalDateTime.now()).build()));

        return catList;
    }
}
