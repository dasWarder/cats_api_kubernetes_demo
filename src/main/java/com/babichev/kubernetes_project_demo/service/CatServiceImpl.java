package com.babichev.kubernetes_project_demo.service;

import com.babichev.kubernetes_project_demo.dto.CatDTO;
import com.babichev.kubernetes_project_demo.entity.Cat;
import com.babichev.kubernetes_project_demo.mapper.CatMapper;
import com.babichev.kubernetes_project_demo.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.apache.commons.lang3.Validate.notNull;


@Service
@RequiredArgsConstructor
@Slf4j
public class CatServiceImpl implements CatService{

    private final CatRepository catRepository;
    private final CatMapper catMapper;


    @Override
    public Cat save(CatDTO catDTO) {
        Cat cat = catMapper.fromCatDTO(catDTO);
        Cat savedCat = catRepository.save(cat);

        log.info("Save a new cat with id={}", savedCat.getId());
        notNull(savedCat, "A cat must not be null");

        return savedCat;
    }

    @Override
    public Iterable<Cat> getAll() {
        Iterable<Cat> all = catRepository.findAll();

        log.info("Get list of all cats");
        notNull(all, "The list must not be null");
        return all;
    }
}
