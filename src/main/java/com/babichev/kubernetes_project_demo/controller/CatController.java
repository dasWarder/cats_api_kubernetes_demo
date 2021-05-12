package com.babichev.kubernetes_project_demo.controller;


import com.babichev.kubernetes_project_demo.dto.CatDTO;
import com.babichev.kubernetes_project_demo.entity.Cat;
import com.babichev.kubernetes_project_demo.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;

    @PostMapping
    public Cat save(@RequestBody CatDTO catDTO) {
        Cat savedCat = catService.save(catDTO);
        return savedCat;
    }

    @GetMapping
    public Iterable<Cat> getAll() {
        return catService.getAll();
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestParam("id") int id) {
        catService.delete(id);
        return ResponseEntity.ok("The cat with id=" + id +" was successfully deleted!");
    }
}
