package dev.ruthwik.productservice.Dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class dto {
    private Long id;
    private String title;
    private String image;
    private String category;
    private String description;
    private double price;


}