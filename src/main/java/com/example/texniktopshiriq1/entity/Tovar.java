package com.example.texniktopshiriq1.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Tovar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String G32;

    @Column(nullable = false)
    private String G31_NAME;

    @Column(nullable = false)
    private String G31_6;

    @Column(nullable = false)
    private String G43;
}
