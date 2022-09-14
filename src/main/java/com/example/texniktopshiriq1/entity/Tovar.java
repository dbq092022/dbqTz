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
    private String g32;

    @Column(nullable = false)
    private String g31_name;

    @Column(nullable = false)
    private String g31_6;

    @Column(nullable = false)
    private String g43;

    @ManyToOne(optional = false)
    private DeclarationData declarationData;
}
