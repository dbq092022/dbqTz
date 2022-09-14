package com.example.texniktopshiriq1.payload;

import com.example.texniktopshiriq1.entity.GTDInformation;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class DeclarationDataDTO {
    private String G7_A;

    private Date G7_B;

    private String G7_C;

    private String STATUS;

    private String FLAG_R;

    private String G1_A;

    private String G1_B;

    private String G8_NAME;

    private String G8_CODE2;

    private String G22_A;

    private Double G23;

    private Integer gtdInformationId;
}
