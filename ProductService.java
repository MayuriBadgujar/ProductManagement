package com.Spring2.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    public void addStudent(Product student) {
        productRepository.addStudent(student);

    }

    public List<Product> getProduct() {
        return productRepository.getProduct();
    }

    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }

    public void deleteById(int id) {
        productRepository.deleteById(id);
    }
}
