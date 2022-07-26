package com.example.repository.impl;

import com.example.model.Product;
import com.example.repository.IProductRypository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class ProductRepository implements IProductRypository {
    private static List<Product> productList = new ArrayList<>();
    @Override
    public List<Product> findAll() {
        TypedQuery<Product> typedQuery= Dbconnection.entityManager.createQuery("select s from Product s ", Product.class);
        return typedQuery.getResultList();
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
    public void save(Product product) {
        EntityTransaction entityTransaction=Dbconnection.entityManager.getTransaction();
        entityTransaction.begin();
        Dbconnection.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public void edit(Product product) {
        EntityTransaction entityTransaction = Dbconnection.entityManager.getTransaction();
        entityTransaction.begin();
        Dbconnection.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public Product findById(Integer id) {
        TypedQuery<Product> typedQuery=Dbconnection.entityManager.createQuery
                ("select s from Product as s where s.id=:id", Product.class);
        typedQuery.setParameter("id", id);
        try {
            return typedQuery.getSingleResult();
        }catch (Exception e){
            return null;
        }
    }
    @Override
    public void delete(Integer id) {
        EntityTransaction entityTransaction = Dbconnection.entityManager.getTransaction();
        entityTransaction.begin();
        Dbconnection.entityManager.remove(Dbconnection.entityManager.find(Product.class,id));
//        entityTransaction.commit();
    }
}