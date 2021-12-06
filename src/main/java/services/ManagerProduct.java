package services;

import daos.CRUDProduct;
import models.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public class ManagerProduct {
    public static ArrayList<Product> listProduct = new ArrayList<>();

    public ManagerProduct() {
        try {
            listProduct = (ArrayList<Product>) CRUDProduct.showProduct();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(Product product) throws Exception {
        CRUDProduct.createProduct(product);
        listProduct.add(product);
    }

    public void edit(Product product, int index) throws SQLException {
        CRUDProduct.edit(product);
        listProduct.set(index, product);
    }

    public void delete(int index) throws SQLException {
        CRUDProduct.delete(listProduct.get(index).getMaSanPham());
        listProduct.remove(index);
    }


    public ArrayList<Product> findByName(String name) throws SQLException {
        return CRUDProduct.findByName(name);

    }

    //    public void edit(Product product, int index) throws Exception{
//        CRUDProduct.editProduct(product);
//        listProduct.set(index, product);
//    }
//
//    public void delete(int index) throws SQLException {
//        ManagerTaiLieu.delete(listTaiLieu.get(index).getNameBook());
//        listTaiLieu.remove(index);
//    }
//
//
//    public ArrayList<TaiLieu> findByName(String name) throws SQLException {
//        return ManagerTaiLieu.findByName(name);
//
//    }

    }

