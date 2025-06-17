package est.example.productsapi.service;

import est.example.productsapi.dto.ProductSpec;
import est.example.productsapi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductService {

    private final ProductRepository repository;

    public List<ProductSpec> findAll() {
        return repository.findAll()
                .stream()
                .map(ProductSpec::from)
                .toList();
    }

}
