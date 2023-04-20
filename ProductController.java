package com.Spring2.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Product")
public class ProductController {
    @Autowired
    ProductService productService;

    //add product
    // postman  :localhost:8080/Product/add_product
    @PostMapping("/add_product")
    public String addProduct(@RequestBody Product product){
        productService.addStudent(product);
        return "Product Added Successfully";
    }

    //get all products
    //postman  :localhost:8080/Product/get_product
    @GetMapping("/get_product")
    public List<Product> getProduct(){
        return productService.getProduct();
    }

    //get product by id
    //postman   :localhost:8080/Product/get_product_By_id?id=1
    @GetMapping("/get_product_By_id")
    public Product getProductById(@RequestParam("id") int id){
        return productService.getProductById(id);
    }

    //delete by id
    @DeleteMapping("/delete_by_id")
    public void deleteById(@RequestParam int id){
        productService.deleteById(id);
     //   return "Product deleted";
    }

}
