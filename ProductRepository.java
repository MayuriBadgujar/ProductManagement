package com.Spring2.Project;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public  class ProductRepository {

    HashMap<String, Product> productHashMap=new HashMap<>();

    public void addStudent(Product product){
        productHashMap.put(product.getName(),product);
    }

    public List<Product> getProduct() {
        return new ArrayList<>(productHashMap.values());
    }

    public Product getProductById(int id) {
        return productHashMap.get(id);
    }

    public void deleteById(int id) {
        productHashMap.remove(id);
    }
}
