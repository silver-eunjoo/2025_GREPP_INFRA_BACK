package est.example.productsapi.controller;

import est.example.productsapi.dto.ProductSpec;
import est.example.productsapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*", methods = RequestMethod.GET)
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping("/")
    public List<ProductSpec> getAllProducts() {
        return service.findAll();
    }

}
