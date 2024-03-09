package dev.ruthwik.productservice.services;

import dev.ruthwik.productservice.Dtos.dto;
import dev.ruthwik.productservice.models.Product;
import dev.ruthwik.productservice.models.Category;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService1 implements ProductService {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String API_BASE_URL = "https://fakestoreapi.com/products";

    @Override
    public List<Product> getProducts() {
        return Arrays.stream(restTemplate.getForObject(API_BASE_URL, dto[].class))
                .map(this::mapDtoToProduct)
                .collect(Collectors.toList());
    }

    public void deleteProduct(Long id) {
        restTemplate.delete(API_BASE_URL + "/" + id);
        System.out.println("Product deleted successfully!!!");
    }

    public Product getProduct(Long id) {
        return mapDtoToProduct(restTemplate.getForObject(API_BASE_URL + "/" + id, dto.class));
    }

    public List<Product> getProductsByCategory(String categoryName) {
        return Arrays.stream(restTemplate.getForObject(API_BASE_URL + "/category/" + categoryName, dto[].class))
                .map(this::mapDtoToProduct)
                .collect(Collectors.toList());
    }

    public List<String> getCategories() {
        return Arrays.asList(restTemplate.getForObject(API_BASE_URL + "/categories", String[].class));
    }

    public Product addProduct(Product product) {
        restTemplate.postForObject(API_BASE_URL, mapProductToDto(product), dto.class);
        System.out.println("Product created successfully!!!");
        return product;
    }

    public Product updateProduct(Product product) {
        restTemplate.put(API_BASE_URL + "/" + product.getId(), mapProductToDto(product));
        System.out.println("Product updated successfully!!!");
        return product;
    }

    private Product mapDtoToProduct(dto dto) {
        Product product = new Product();
        product.setId(dto.getId());
        product.setTitle(dto.getTitle());
        product.setPrice(dto.getPrice());
        product.setImageUrl(dto.getImage());
        product.setDescription(dto.getDescription());
        Category category = new Category();
        category.setName(dto.getCategory());
        product.setCategory(category);
        return product;
    }

    private dto mapProductToDto(Product product) {
        dto storeProduct = new dto();
        storeProduct.setId(product.getId());
        storeProduct.setTitle(product.getTitle());
        storeProduct.setPrice(product.getPrice());
        storeProduct.setImage(product.getImageUrl());
        storeProduct.setDescription(product.getDescription());
        storeProduct.setCategory(product.getCategory().getName());
        return storeProduct;
    }
}
