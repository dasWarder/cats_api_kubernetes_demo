package com.babichev.kubernetes_project_demo.service;

import com.babichev.kubernetes_project_demo.dto.CatDTO;
import com.babichev.kubernetes_project_demo.entity.Cat;

import java.util.List;

public interface CatService {

    Cat save(CatDTO catDTO);

    Iterable<Cat> getAll();
}
