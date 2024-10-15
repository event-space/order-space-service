package com.eventspace.spring.spaceservice.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class SpaceResponse {
    private Long id;
    private String name;
    private String address;
    private String location;
    private Integer size;
    private Integer maxCapacity;
    private Double baseRentalCost;
    @Column(name = "image_url")
    private String imageUrl;
}
