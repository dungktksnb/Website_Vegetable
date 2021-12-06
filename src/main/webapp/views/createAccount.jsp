<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/8/2021
  Time: 11:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <form action="/login?action=createAccount" method="post">
        <table class="table">
            <thead>
            <tr>
                <th>Tài Khoản</th>
                <th>Mật Khẩu</th>
                <th>Họ Tên</th>
                <th>Giới Tính</th>
                <th>Ngày Sinh</th>
                <th>Địa Chỉ</th>
                <th>Email</th>
                <th>Số điện thoại</th>
                <th>Nhóm Quyền</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input placeholder="Nhập Tài Khoản" name="taikhoan"></td>
                <td><input placeholder="Nhập Mật Khẩu" name="matkhau"></td>
                <td><input placeholder="Nhập Họ Tên" name="hoten"></td>
                <td><input placeholder="Nhập Giới Tính" name="gioitinh"></td>
                <td><input placeholder="Nhập Ngày Sinh" name="ngaysinh"></td>
                <td><input placeholder="Nhập Địa Chỉ" name="diachi"></td>
                <td><input placeholder="Nhập Email" name="email"></td>
                <td><input placeholder="Nhập Số Điện Thoại" name="sodienthoai"></td>
                <td><input placeholder="Nhập Nhóm Quyền" name="nhomquyen"></td>

            </tr>
            </tbody>
        </table>
        <button type="submit" class="btn btn-success">Create Account</button>
        <table class="table table-success table-striped">
        </table>
    </form>
</div>
</body>
</html>

