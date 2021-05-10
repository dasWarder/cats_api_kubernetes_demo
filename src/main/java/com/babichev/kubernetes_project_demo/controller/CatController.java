package com.babichev.kubernetes_project_demo.controller;


import com.babichev.kubernetes_project_demo.dto.CatDTO;
import com.babichev.kubernetes_project_demo.entity.Cat;
import com.babichev.kubernetes_project_demo.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static com.babichev.kubernetes_project_demo.mapper.CatMapper.CAT_MAPPER;

@RestController
@RequestMapping("/cats")
public class CatController {

    private final CatRepository catRepository;

    @Autowired
    public CatController(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @PostMapping
    @ResponseBody
    public Cat save(CatDTO catDTO) {
        Cat cat = CAT_MAPPER.fromCatDTO(catDTO);
        Cat savedCat = catRepository.save(cat);

        return savedCat;
    }
}
