package ra.edu.api.product_management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.edu.api.product_management.model.entity.ProductDTO;
import ra.edu.api.product_management.repository.ProductRepository;
import ra.edu.api.product_management.service.ProductService;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<ProductDTO> getProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public boolean addProduct(ProductDTO productDTO) {
        return productRepository.addProduct(productDTO);
    }

    @Override
    public boolean updateProduct(ProductDTO productDTO) {
        return productRepository.updateProduct(productDTO);
    }

    @Override
    public boolean deleteProduct(String id) {
        return productRepository.deleteProduct(id);
    }

}
