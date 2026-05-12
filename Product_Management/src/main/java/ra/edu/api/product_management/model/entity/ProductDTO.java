package ra.edu.api.product_management.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductDTO {
    private String id;
    private String name;
    private String producer;
    private Integer yearMaking;
    private LocalDate expiryDate;
    private double price;
}
