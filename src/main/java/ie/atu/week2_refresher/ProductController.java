package ie.atu.week2_refresher;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private List<Service> products = new ArrayList<>();

    @GetMapping
    public List<Service> getAllProducts() {
        return products;
    }

    @PostMapping
    public void addProduct(@RequestBody Service service) {
        products.add(service);
    }
}



