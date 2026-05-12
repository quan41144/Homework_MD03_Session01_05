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
    public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO productDTO) {
        productService.addProduct(productDTO);
        return new ResponseEntity<>(productDTO, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> updateProduct(@PathVariable String id, @RequestBody ProductDTO productDTO) {
        productDTO.setId(id);
        productService.updateProduct(productDTO);
        return new ResponseEntity<>(productDTO, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable String id) {
        boolean deleted = productService.deleteProduct(id);
        if (deleted) {
            return new ResponseEntity<>("Xóa thành công sản phẩm ID: " + id, HttpStatus.OK);
        }
        return new ResponseEntity<>("Không tìm thấy sản phẩm ID: " + id, HttpStatus.NOT_FOUND);
    }
}
