package daos;

import models.Account;
import models.Product;

import java.sql.*;
import java.util.ArrayList;

public class CRUDAccount {
    static Connection connection = ConnectionMySQL.getConnection();
    Account account = new Account();

    public static ArrayList<Account> showAccount() throws Exception {
        String query = "select * from users";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        ArrayList<Account> listAccount = new ArrayList<>();
        while (resultSet.next()) {
            String userName = resultSet.getString("TaiKhoan");
            String passWord = resultSet.getString("MatKhau");
            String hoTen = resultSet.getString("HoTen");
            String gioiTinh = resultSet.getString("GioiTinh");
            String ngaySinh = String.valueOf(resultSet.getDate("NgaySinh"));
            String diaChi = resultSet.getString("DiaChi");
            String email = resultSet.getString("Email");
            String soDienThoai = resultSet.getString("SoDienThoai");
            int nhomQuyen = resultSet.getInt("NhomQuyen");
            listAccount.add(new Account(userName, passWord, hoTen, gioiTinh, ngaySinh, diaChi, email, soDienThoai, nhomQuyen));
        }
        return listAccount;
    }

    public static void createAccount(Account account) throws Exception {
        String query = "insert into users value(?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, account.getUserName());
        preparedStatement.setString(2, account.getPassWord());
        preparedStatement.setString(3, account.getHoTen());
        preparedStatement.setString(4, account.getGioiTinh());
        preparedStatement.setString(5, account.getNgaySinh());
        preparedStatement.setString(6, account.getDiaChi());
        preparedStatement.setString(7, account.getEmail());
        preparedStatement.setString(8, account.getSoDienThoai());
        preparedStatement.setInt(9, account.getNhomQuyen());
        preparedStatement.executeUpdate();
    }

    //    public static void checkLogin(String username1, String password) throws Exception {
//        String query = "select* from users where Taikhoan=? and MaKhau=?";
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(query);
//        boolean check;
//        while (resultSet.next()) {
//            String userName = resultSet.getString("TaiKhoan");
//            String passWord = resultSet.getString("MatKhau");
//            String hoTen = resultSet.getString("HoTen");
//            String gioiTinh = resultSet.getString("GioiTinh");
//            String ngaySinh = String.valueOf(resultSet.getDate("NgaySinh"));
//            String diaChi = resultSet.getString("DiaChi");
//            String email = resultSet.getString("Email");
//            String soDienThoai = resultSet.getString("SoDienThoai");
//            int nhomQuyen = resultSet.getInt("NhomQuyen");
//
//
//        }
//        if (userName.equals(username1)){
//
//        }
    public static boolean checkLogin(String username, String password) {
        boolean isValid = false;
        try {
            ConnectionMySQL sqlConnection;
            Connection connection = ConnectionMySQL.getConnection();
            String sql = "select * from users where TaiKhoan = ? and MatKhau = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                isValid = true;
            } else {
                isValid = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isValid;
    }

}
