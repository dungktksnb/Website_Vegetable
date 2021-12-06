package models;

import java.time.LocalDate;

public class Account {
    private String userName;
    private String passWord;
    private  String hoTen;
    private  String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String email;
    private String soDienThoai;
    private int nhomQuyen;

    public Account() {
    }

    public Account(String userName, String passWord, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String email, String soDienThoai, int nhomQuyen) {
        this.userName = userName;
        this.passWord = passWord;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.nhomQuyen = nhomQuyen;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getNhomQuyen() {
        return nhomQuyen;
    }

    public void setNhomQuyen(int nhomQuyen) {
        this.nhomQuyen = nhomQuyen;
    }
}
