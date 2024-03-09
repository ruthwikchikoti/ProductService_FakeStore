package dev.ruthwik.productservice.services;

import dev.ruthwik.productservice.models.Product;
import java.util.List;



    public interface ProductService {
        public List<Product> getProducts();
        public Product getProduct(Long id);
        public Product addProduct(Product product);
        public Product updateProduct(Product product);
        public void deleteProduct(Long id);
        public List<Product> getProductsByCategory(String categoryName);
        public List<String> getCategories();


    }
