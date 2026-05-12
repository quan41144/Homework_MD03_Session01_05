package ra.edu.api.product_management.repository;

import ra.edu.api.product_management.model.entity.ProductDTO;

import java.util.List;

public interface ProductRepository {
    List<ProductDTO> getAllProducts();
    boolean addProduct(ProductDTO productDTO);
    boolean updateProduct(ProductDTO productDTO);
    boolean deleteProduct(String id);
}
