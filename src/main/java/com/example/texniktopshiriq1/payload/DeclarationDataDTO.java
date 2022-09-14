package com.example.texniktopshiriq1.payload;

import com.example.texniktopshiriq1.entity.GTDInformation;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class DeclarationDataDTO {
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

    private Integer gtdInformationId;
}
