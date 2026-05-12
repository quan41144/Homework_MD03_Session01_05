package ra.edu.api.product_management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ra.edu.api.product_management.model.entity.ProductDTO;
import ra.edu.api.product_management.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<String> addProduct(@RequestBody ProductDTO productDTO) {
        return new ResponseEntity<>(String.valueOf(productService.addProduct(productDTO)), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<String> updateProduct(@RequestBody ProductDTO productDTO) {
        return new ResponseEntity<>(String.valueOf(productService.updateProduct(productDTO)), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@RequestBody String id) {
        return new ResponseEntity<>(String.valueOf(productService.deleteProduct(id)), HttpStatus.NO_CONTENT);
    }
}
