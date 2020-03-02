package com.databaserelationship.dbrelationonetomany.resources.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "intern_details")
@Getter @NoArgsConstructor
public class InternDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("address")
    private String address;

    @JsonProperty("zip_code")
    private Integer zipCode;

    public InternDetails(String address, Integer zipCode) {
        this.address = address;
        this.zipCode = zipCode;
    }
}