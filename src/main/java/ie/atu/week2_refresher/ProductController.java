package ie.atu.week2_refresher;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private List<Product> products = new ArrayList<>();

    @GetMapping("/getdetails")
    public List<Product> getAllProducts() {
        return products;
    }

    @PostMapping("/postdetails")
    public void addProduct(@RequestBody Product product) {
        products.add(product);
    }
}



