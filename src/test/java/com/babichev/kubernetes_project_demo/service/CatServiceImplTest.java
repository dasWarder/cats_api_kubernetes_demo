package com.babichev.kubernetes_project_demo.service;

import com.babichev.kubernetes_project_demo.entity.Cat;
import com.babichev.kubernetes_project_demo.repository.CatRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CatServiceImplTest {

        @Autowired
        private CatRepository catRepository;


        @Test
        @Sql(scripts = {"classpath:clearDb.sql", "classpath:populateBaseGetAllCats.sql"})
        public void shouldGetAllCats() {
                List<Cat> catsList = catRepository.findAll();

                Assertions.assertNotNull(catsList);
                Assertions.assertEquals(2, catsList.size());
        }
}