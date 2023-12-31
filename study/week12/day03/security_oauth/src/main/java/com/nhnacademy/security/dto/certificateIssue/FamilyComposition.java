package com.nhnacademy.security.dto.certificateIssue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FamilyComposition {
    private String relation;
    private String name;
    private String birth;
    private String idNumber;
    private String genderCode;
}
