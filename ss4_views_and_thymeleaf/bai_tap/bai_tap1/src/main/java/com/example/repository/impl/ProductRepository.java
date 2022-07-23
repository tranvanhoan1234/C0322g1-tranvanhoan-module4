package com.example.repository.impl;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {

        productList.add(new Product(1, "kem", 300000, "vip", "ok"));
        productList.add(new Product(2, "cas", 300000, "pro", "ok"));
        productList.add(new Product(3, "ga", 300000, "vip", "ok"));
        productList.add(new Product(4, "cho", 300000, "vip", "ok"));
        productList.add(new Product(5, "meo", 300000, "vip", "ok"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList);
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void update(Product product) {
        for (Product p : productList) {
            if (p.getId().equals(product.getId())) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                p.setDescription(product.getDescription());
                p.setManufacturer(product.getManufacturer());
                break;
            }
        }
    }

    @Override
    public void remove(Integer id) {
        productList.remove(findById(id));
    }

    @Override
    public List<Product> search(String s) {
        List<Product> productList2 = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().contains(s)) {
                productList2.add(p);

            }
        }
        return productList2;
    }
}
