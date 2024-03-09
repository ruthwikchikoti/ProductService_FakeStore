package dev.ruthwik.productservice.controllers;
import dev.ruthwik.productservice.models.Product;
import dev.ruthwik.productservice.services.ProductService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService Productservice;

    public ProductController(ProductService Productservice) {
        this.Productservice = Productservice;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hellojadcj";
    }
    @GetMapping("/sing")
    public String sayShavaShava() {
        return "Shava Shava";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return Productservice.getProducts();
    }
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Long id) {
        return Productservice.getProduct(id);
    }

    @DeleteMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        Productservice.deleteProduct(id);
        return "Your Product has been deleted";
    }

    @PostMapping("/products/add")
    public Product addProduct(@RequestBody Product product) {
        return Productservice.addProduct(product);
    }

    @PutMapping("/products/update")
    public Product updateProduct(@RequestBody Product product) {
        return Productservice.updateProduct(product);
    }
    @GetMapping("/products/categories")
    public List<String> getCategories() {
        return Productservice.getCategories();
    }
    @GetMapping("/products/category/{CategoryName}")
    public List<Product> getProductsByCategory(@PathVariable String CategoryName) {
        return Productservice.getProductsByCategory(CategoryName);
    }
}