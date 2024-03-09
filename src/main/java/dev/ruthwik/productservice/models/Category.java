package dev.ruthwik.productservice.models;


import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Getter
@Setter
public class Category  {
    private Long id;
    private String name;
}
