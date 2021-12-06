package controllers;


import daos.CRUDProduct;
import models.Account;
import models.Product;
import services.ManagerProduct;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "ServletHome", urlPatterns = {"/home"})
public class ServletHome extends HttpServlet {

    RequestDispatcher requestDispatcher;
    ManagerProduct managerProduct = new ManagerProduct();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        RequestDispatcher requestDispatcher;
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                response.sendRedirect("/views/createProduct.jsp");
                break;
            case "showProduct":
                try {
                    request.setAttribute("listProduct", CRUDProduct.showProduct());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                requestDispatcher = request.getRequestDispatcher("views/showProduct.jsp");
                requestDispatcher.forward(request, response);
                break;
            case "delete":
                int index = Integer.parseInt(request.getParameter("index"));
                try {
                    managerProduct.delete(index);
                    request.setAttribute("listProduct", CRUDProduct.showProduct());
                    requestDispatcher = request.getRequestDispatcher("views/homes.jsp");
                    requestDispatcher.forward(request, response);
                } catch (Exception throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "edit":
//                response.sendRedirect("views/editProduct.jsp");
                try {
                    int indexedit= Integer.parseInt(request.getParameter("index"));
                    request.setAttribute("Product", CRUDProduct.showProduct().get(indexedit));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                requestDispatcher = request.getRequestDispatcher("views/editProduct.jsp");
                requestDispatcher.forward(request, response);


            default:
                try {
                    request.setAttribute("listProduct", CRUDProduct.showProduct());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                requestDispatcher = request.getRequestDispatcher("views/homes.jsp");
                requestDispatcher.forward(request, response);


        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "createProduct":
                int maSanPham = Integer.parseInt(request.getParameter("masanpham"));
                int maDanhMuc = Integer.parseInt(request.getParameter("madanhmuc"));
                String tenSanPham = request.getParameter("tensanpham");
                double giaGoc = Double.parseDouble(request.getParameter("giagoc"));
                double giaKhuyenMai = Double.parseDouble(request.getParameter("giakhuyenmai"));
                String donViTinh = request.getParameter("donvitinh");
                String img = request.getParameter("anh");
                String moTaNgan = request.getParameter("motangan");
                String moTaChiTiet = request.getParameter("motachitiet");
                Product product = new Product(maSanPham, maDanhMuc, tenSanPham, giaGoc, giaKhuyenMai, donViTinh, img, moTaNgan, moTaChiTiet);
                try {
                    managerProduct.save(product);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                response.sendRedirect("/home");

                try {
                    managerProduct.save(product);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "edit":
                int maSanPham1 = Integer.parseInt(request.getParameter("masanpham"));
                int maDanhMuc1 = Integer.parseInt(request.getParameter("madanhmuc"));
                String tenSanPham1 = request.getParameter("tensanpham");
                double giaGoc1 = Double.parseDouble(request.getParameter("giagoc"));
                double giaKhuyenMai1 = Double.parseDouble(request.getParameter("giakhuyenmai"));
                String donViTinh1 = request.getParameter("donvitinh");
                String img1 = request.getParameter("anh");
                String moTaNgan1 = request.getParameter("motangan");
                String moTaChiTiet1 = request.getParameter("motachitiet");
                Product product1 = new Product(maSanPham1, maDanhMuc1, tenSanPham1, giaGoc1, giaKhuyenMai1,donViTinh1, img1, moTaNgan1, moTaChiTiet1);
                int indexedit= Integer.parseInt(request.getParameter("index"));
                try {
                    managerProduct.edit(product1,indexedit);
                    request.setAttribute("listProduct", CRUDProduct.showProduct());
                } catch (Exception throwables) {
                    throwables.printStackTrace();
                }
                requestDispatcher = request.getRequestDispatcher("views/homes.jsp");
                requestDispatcher.forward(request, response);
                break;
        }

    }public Account delete(String moTaNgan){
        return  new Account("dung","dung","dung","dung","dung","dung","dung","dung",1);

    }
}
