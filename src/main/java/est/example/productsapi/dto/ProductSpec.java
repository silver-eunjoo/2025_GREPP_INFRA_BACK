package est.example.productsapi.dto;

import est.example.productsapi.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductSpec {

    private String code;
    private String name;

    public static ProductSpec from(Product product) {
        ProductSpec productSpec = new ProductSpec();

        productSpec.name = product.getName();
        productSpec.code = product.getCode();

        return productSpec;
    }

}
