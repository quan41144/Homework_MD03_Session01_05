package ra.edu.api.product_management.service;

import ra.edu.api.product_management.model.entity.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getProducts();
    boolean addProduct(ProductDTO productDTO);
    boolean updateProduct(ProductDTO productDTO);
    boolean deleteProduct(String id);
}
