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

    private String g7_a;

    private Date g7_b;

    private String g7_c;

    private String status;

    private String flag_r;

    private String g1_a;

    private String g1_b;

    private String g8_name;

    private String g8_code2;

    private String g22_a;

    private Double g23;

    @OneToOne(optional = false)
    private GTDInformation gtdInformation;
}
