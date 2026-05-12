package ra.edu.api.product_management.repository.impl;

import org.springframework.stereotype.Repository;
import ra.edu.api.product_management.model.entity.ProductDTO;
import ra.edu.api.product_management.repository.ProductRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private List<ProductDTO> list = new ArrayList<>();
    public void ProductDTO() {
        list.add(new ProductDTO("p01", "Laptop HP", "HP", 2021, LocalDate.parse("2021-12-21"), 15000000));
        list.add(new ProductDTO("p02", "Laptop HP", "HP", 2021, LocalDate.parse("2021-12-21"), 15000000));
        list.add(new ProductDTO("p03", "Laptop HP", "HP", 2021, LocalDate.parse("2021-12-21"), 15000000));
    }
    @Override
    public List<ProductDTO> getAllProducts() {
        return list;
    }

    @Override
    public boolean addProduct(ProductDTO productDTO) {
        return list.add(productDTO);
    }

    @Override
    public boolean updateProduct(ProductDTO productDTO) {
        for (ProductDTO p : list) {
            if (p.getId().equalsIgnoreCase(productDTO.getId())) {
                list.remove(p);
                list.add(productDTO);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteProduct(String id) {
        for (ProductDTO p : list) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.println("Xóa thành công sản phẩm ID: " + id);
                list.remove(p);
                return true;
            }
        }
        return false;
    }
}
