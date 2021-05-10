package com.babichev.kubernetes_project_demo.mapper;

import com.babichev.kubernetes_project_demo.dto.CatDTO;
import com.babichev.kubernetes_project_demo.entity.Cat;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@Component
public class MapperImpl implements CatMapper{
    @Override
    public CatDTO fromCat(Cat cat) {
        CatDTO catDTO = new CatDTO()
                .setName(cat.getName())
                .setBirthDay(cat.getBirthDate());

        return catDTO;
    }

    @Override
    public List<CatDTO> fromCatList(List<Cat> catList) {
        return null;
    }

    @Override
    public Cat fromCatDTO(CatDTO catDTO) {
        Cat cat = new Cat()
                .setName(catDTO.getName())
                .setBirthDate(catDTO.getBirthDay())
                .setCreatedAt(LocalDateTime.now());

        return cat;
    }

    @Override
    public List<Cat> fromCatDTOList(List<CatDTO> catDTOList) {
        return null;
    }
}
