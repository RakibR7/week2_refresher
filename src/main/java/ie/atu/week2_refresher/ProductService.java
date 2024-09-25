package ie.atu.week2_refresher;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();
    public List<Product> getAllProducts() {
        return productList;
    }
    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }
}