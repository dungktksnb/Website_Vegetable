<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/8/2021
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/8/2021
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Create Table</h2>
    <form action="/home?action=createProduct" method="post">
        <table class="table">
            <thead>
            <tr>
                <th>Mã Sản phẩm</th>
                <th>Mã Danh Mục</th>
                <th>Tên Sản Phẩm</th>
                <th>Giá Gốc</th>
                <th>Giá Khuyến Mại</th>
                <th>Đơn Vị Tính</th>
                <th>Ảnh</th>
                <th>Mô Tả Ngắn</th>
                <th>Mô Tả Chi Tiết</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input placeholder="Nhập mã sản phẩm" name="masanpham"></td>
                <td><input placeholder="Nhập mã danh mục" name="madanhmuc"></td>
                <td><input placeholder="Nhập tên sản phẩm" name="tensanpham"></td>
                <td><input placeholder="Nhập giá gốc" name="giagoc"></td>
                <td><input placeholder="Nhập giá khuyến mại" name="giakhuyenmai"></td>
                <td><input placeholder="Nhập đơn vị tính" name="donvitinh"></td>
                <td><input placeholder="Nhập ảnh" name="anh"></td>
                <td><input placeholder="Nhập mô tả ngắn" name="motangan"></td>
                <td><input placeholder="Nhập mô tả chi tiết" name="motachitiet"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="btn btn-success">Create Product</button>
        <table class="table table-success table-striped">
        </table>
    </form>
</div>
</body>
</html>

