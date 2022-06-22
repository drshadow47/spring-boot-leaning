package com.shadow.test.Test.Project.service;

import com.google.gson.Gson;
import com.shadow.test.Test.Project.dto.ProductResponseDto;
import com.shadow.test.Test.Project.entity.Product;
import com.shadow.test.Test.Project.repository.ProductRepo;
import org.json.JSONString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisAccessor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;



    public static Gson gson = new Gson();

    public ProductResponseDto saveProduct(Product product){
        ProductResponseDto responseDto =new ProductResponseDto();
        RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();
        System.out.print(redisTemplate);
        String obj = gson.toJson(product);
        System.out.print("Value:::" +obj);
        redisTemplate.opsForValue().set("Products",obj);
        productRepo.save(product);
        responseDto.setProductDetail(product);
        return responseDto;
    }
    public List<Product> saveProducts(List<Product> product){
        return productRepo.saveAll(product);
    }

    public List<Product> getProducts(){
        return productRepo.findAll();
    }
    public Product getProductById(int id){
        return productRepo.findById(id).orElse(null);
    }
    public Product getProductByName(String name){
        return productRepo.findByName(name);
    }

    public String deleteProduct(int id){
         productRepo.deleteById(id);
         return "Product removed ||"+id;

    }

    public Product updateProduct(Product product){
        Product existingProd =  productRepo.findById(product.getId()).orElse(null);

        assert existingProd != null;
          existingProd.setName(product.getName());
          existingProd.setPrice(product.getPrice());
          existingProd.setQuantity(product.getQuantity());
          return productRepo.save(existingProd);

    }
}
