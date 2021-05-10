package com.babichev.kubernetes_project_demo.service;

import com.babichev.kubernetes_project_demo.dto.CatDTO;
import com.babichev.kubernetes_project_demo.entity.Cat;
import com.babichev.kubernetes_project_demo.mapper.CatMapper;
import com.babichev.kubernetes_project_demo.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
@RequiredArgsConstructor
public class CatServiceImpl implements CatService{

    private final CatRepository catRepository;
    private final CatMapper catMapper;


    @Override
    public Cat save(CatDTO catDTO) {
        Cat cat = catMapper.fromCatDTO(catDTO);
        Cat savedCat = catRepository.save(cat);

        return savedCat;
    }

    @Override
    public Iterable<Cat> getAll() {
        Iterable<Cat> all = catRepository.findAll();
        return all;
    }
}
