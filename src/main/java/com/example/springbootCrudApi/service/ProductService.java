package com.example.springbootCrudApi.service;

import com.example.springbootCrudApi.entity.Product;
import com.example.springbootCrudApi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
        return  repository.save(product);
    }
    public List<Product> saveProduct(List<Product> products){
        return  repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }
    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }
    public Product getProductByName(String name){
        return repository.findByName(name);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product is remove id:"+id;
    }
    public Product updateProduct(Product product){
        Product existinfProduct = repository.findById(product.getId()).orElse(null);
        existinfProduct.setName(product.getName());
        existinfProduct.setQuantity(product.getQuantity());
        existinfProduct.setPrice(product.getPrice());

        return repository.save(existinfProduct);

    }

}