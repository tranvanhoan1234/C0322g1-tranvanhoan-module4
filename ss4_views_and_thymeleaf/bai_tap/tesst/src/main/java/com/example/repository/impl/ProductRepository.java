package com.example.repository.impl;

import com.example.modle.Product;
import com.example.repository.IProductRypository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRypository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "kem", 100000, "vip", "toyota"));
        productList.add(new Product(2, "dua hau", 200000, "vip", "toyota"));
        productList.add(new Product(3, "keo ngot", 300000, "vip", "toyota"));
        productList.add(new Product(4, "keo dang", 400000, "vip", "toyota"));
        productList.add(new Product(5, "keo chua", 500000, "vip", "toyota"));
        productList.add(new Product(6, "keo ngu", 600000, "vip", "toyota"));


    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public List<Product> findByName(String s) {
        List<Product> productList1 = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().contains(s)) {
                productList1.add(p);
            }
        }
        return productList1;
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                break;
            }
        }
    }
}
