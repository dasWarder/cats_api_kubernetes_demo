package com.babichev.kubernetes_project_demo.dto;


import lombok.Data;

import java.time.LocalDate;

@Data
public class CatDTO {
    private String name;
    private LocalDate birthDay;
}
