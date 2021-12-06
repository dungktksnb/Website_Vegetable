package daos;

import models.Product;

import java.sql.*;
import java.util.ArrayList;

public class CRUDProduct {
    static Connection connection = ConnectionMySQL.getConnection();
    Product product = new Product();

    public static ArrayList<Product> showProduct() throws Exception {
        String query = "select * from sanpham";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        ArrayList<Product> listProduct = new ArrayList<>();
        while (resultSet.next()) {
            int maSanPham = resultSet.getInt("MaSanPham");
            int maDanhMuc = resultSet.getInt("Ma_DanhMuc");
            String tenSanPham = resultSet.getString("TenSanPham");
            double giaGoc = resultSet.getDouble("GiaGoc");
            double giaKhuyenMai = resultSet.getDouble("KhuyenMai");
            String donViTinh = resultSet.getString("DonViTinh");
            String img = resultSet.getString("ImgUrl");
            String moTaNgan = resultSet.getString("MoTangan");
            String moTaChiTiet = resultSet.getString("MoTaChiTiet");
            listProduct.add(new Product(maSanPham, maDanhMuc, tenSanPham, giaGoc, giaKhuyenMai, donViTinh, img, moTaNgan, moTaChiTiet));
        }
        return listProduct;
    }

    public static void createProduct(Product product) throws Exception {
        String query = "insert into sanpham value(?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, product.getMaSanPham());
        preparedStatement.setInt(2, product.getMaDanhmuc());
        preparedStatement.setString(3, product.getTenSanPham());
        preparedStatement.setDouble(4, product.getGiaGoc());
        preparedStatement.setDouble(5, product.getGiaKhuyenMai());
        preparedStatement.setString(6, product.getDonViTinh());
        preparedStatement.setString(7, product.getImg());
        preparedStatement.setString(8, product.getMoTaNgan());
        preparedStatement.setString(9, product.getMoTaChiTiet());
        preparedStatement.executeUpdate();

    }
    public static void edit(Product product) throws SQLException {
        String edit = "update sanpham set Ma_DanhMuc=?,TenSanPham=?,GiaGoc=?,KhuyenMai=?,DonViTinh=?,ImgUrl=?,MoTaNgan=?,MoTaChiTiet=? where MaSanPham=?";
        PreparedStatement preparedStatement = connection.prepareStatement(edit);
        preparedStatement.setInt(9,product.getMaSanPham());
        preparedStatement.setInt(1, product.getMaDanhmuc());
        preparedStatement.setString(2, product.getTenSanPham());
        preparedStatement.setDouble(3, product.getGiaGoc());
        preparedStatement.setDouble(4, product.getGiaKhuyenMai());
        preparedStatement.setString(5, product.getDonViTinh());
        preparedStatement.setString(6, product.getImg());
        preparedStatement.setString(7, product.getMoTaChiTiet());
        preparedStatement.setString(8, product.getMoTaChiTiet());
        preparedStatement.executeUpdate();
    }

    public static void delete(int id) throws SQLException {
        String delete = " SET FOREIGN_KEY_CHECKS=0;";
        String delete1 = " delete from sanpham where MaSanPham=?;";
        String delete2 = " SET FOREIGN_KEY_CHECKS=1;";
        Statement statement = connection.createStatement();
        statement.execute(delete);
        PreparedStatement preparedStatement = connection.prepareStatement(delete1);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
        statement.execute(delete2);
    }
    public static ArrayList<Product> findByName(String findName) throws SQLException {
        ArrayList<Product> findList = new ArrayList<>();
        String findByName = "select * from books where name like '%" + findName + "%'";
        PreparedStatement preparedStatement = connection.prepareStatement(findByName);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int maSanPham = resultSet.getInt("MaSanPham");
            int maDanhMuc = resultSet.getInt("MaDanhMuc");
            String tenSamPham = resultSet.getString("TenSamPham");
            double giaGoc = resultSet.getDouble("GiaGoc");
            double giaKhuyenMai = resultSet.getDouble("GiaKhuyenMai");
            String donVitinh = resultSet.getString("DonVitinh");
            String img = resultSet.getString("ImgUrl");
            String moTaNgan = resultSet.getString("MoTaNgan");
            String moTaChitiet = resultSet.getString("MoTaChitiet");

            findList.add(new Product(maSanPham, maDanhMuc, tenSamPham, giaGoc, giaKhuyenMai,
                    donVitinh, img, moTaNgan,moTaChitiet));

        }
        return findList;
    }

}



