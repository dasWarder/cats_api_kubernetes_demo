package com.babichev.kubernetes_project_demo.repository;


import com.babichev.kubernetes_project_demo.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<Cat, String> {

}
