package com.nhnacademy.security.dto.birthDeathReportResident;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeathReportUpdateRequest {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date birthDeathReportDate;
    private String emailAddress;
    private String phoneNumber;
}
