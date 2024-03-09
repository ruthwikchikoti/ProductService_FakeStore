package dev.ruthwik.productservice.models;
public class Product {
    private Long id;
    private String title;
    private Double price;
    private String imageUrl;
    private String description;
    private Category category;

    // getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    // setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}