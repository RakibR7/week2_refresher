package ie.atu.week2_refresher;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private List<ProductEntity> products = new ArrayList<>();

    @GetMapping("/getdetails") //GET: http://localhost:8080/products/getdetails
    public List<ProductEntity> getAllProducts() {
        return products;
    }

    @PostMapping("/postdetails") //POST: http://localhost:8080/products/postdetails
    public void addProduct(@RequestBody ProductEntity productEntity) {
        products.add(productEntity);
    }
}



