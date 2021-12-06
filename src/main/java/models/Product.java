package models;

public class Product {
    private  int maSanPham;
    private  int maDanhmuc;
    private String tenSanPham;
    private  double giaGoc;
    private  double giaKhuyenMai;
    private String donViTinh;
    private String img;
    private String moTaNgan;
    private String moTaChiTiet;

    public Product() {
    }

    public Product(int maSanPham, int maDanhmuc, String tenSanPham, double giaGoc, double giaKhuyenMai, String donViTinh, String img, String moTaNgan, String moTaChiTiet) {
        this.maSanPham = maSanPham;
        this.maDanhmuc = maDanhmuc;
        this.tenSanPham = tenSanPham;
        this.giaGoc = giaGoc;
        this.giaKhuyenMai = giaKhuyenMai;
        this.donViTinh = donViTinh;
        this.img = img;
        this.moTaNgan = moTaNgan;
        this.moTaChiTiet = moTaChiTiet;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getMaDanhmuc() {
        return maDanhmuc;
    }

    public void setMaDanhmuc(int maDanhmuc) {
        this.maDanhmuc = maDanhmuc;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaGoc() {
        return giaGoc;
    }

    public void setGiaGoc(double giaGoc) {
        this.giaGoc = giaGoc;
    }

    public double getGiaKhuyenMai() {
        return giaKhuyenMai;
    }

    public void setGiaKhuyenMai(double giaKhuyenMai) {
        this.giaKhuyenMai = giaKhuyenMai;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getMoTaNgan() {
        return moTaNgan;
    }

    public void setMoTaNgan(String moTaNgan) {
        this.moTaNgan = moTaNgan;
    }

    public String getMoTaChiTiet() {
        return moTaChiTiet;
    }

    public void setMoTaChiTiet(String moTaChiTiet) {
        this.moTaChiTiet = moTaChiTiet;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham=" + maSanPham +
                ", maDanhmuc=" + maDanhmuc +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaGoc=" + giaGoc +
                ", giaKhuyenMai=" + giaKhuyenMai +
                ", donViTinh='" + donViTinh + '\'' +
                ", img='" + img + '\'' +
                ", moTaNgan='" + moTaNgan + '\'' +
                ", moTaChiTiet='" + moTaChiTiet + '\'' +
                '}';
    }
}
