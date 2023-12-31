package com.nhnacademy.jpa.repository.certificateIssue;

import com.nhnacademy.jpa.dto.certificateIssue.FamilyRelationAndNumber;
import com.nhnacademy.jpa.entity.CertificateIssue;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface CertificateIssueRepositoryCustom {

    List<FamilyRelationAndNumber> getRelationAndNumber(Long serialNumber);
}
