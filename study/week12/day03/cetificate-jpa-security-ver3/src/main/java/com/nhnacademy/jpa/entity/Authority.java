package com.nhnacademy.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Authoroties")
public class Authority {

    @Id
    private String memberId;
    private String authority;

    @MapsId
    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
