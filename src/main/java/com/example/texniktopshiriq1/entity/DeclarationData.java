package com.example.texniktopshiriq1.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class DeclarationData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String G7_A;

    @Column(nullable = false)
    private Date G7_B;

    @Column(nullable = false)
    private String G7_C;

    @Column(nullable = false)
    private String STATUS;

    @Column(nullable = false)
    private String FLAG_R;

    @Column(nullable = false)
    private String G1_A;

    @Column(nullable = false)
    private String G1_B;

    @Column(nullable = false)
    private String G8_NAME;

    @Column(nullable = false)
    private String G8_CODE2;

    @Column(nullable = false)
    private String G22_A;

    @Column(nullable = false)
    private Double G23;
}
