package ie.atu.labexam23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService  productService)
    {
        this.productService = productService;
    }
}
