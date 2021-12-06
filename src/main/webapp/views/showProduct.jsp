<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/8/2021
  Time: 5:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 7/30/2021
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

<div class="container" STYLE="text-align: center">
    <h2>Show Sản Phẩm</h2><br>
    <a href="/home?action=create" type="button" class="btn btn-success">Create</a><br>

    <table class="table"><br>
        <thead>
        <tr>
            <th></th>
            <th>maSanPham</th>
            <th>maDanhmuc</th>
            <th>tenSanPham</th>
            <th>giaGoc</th>
            <th>giaKhuyenMai</th>
            <th>donViTinh</th>
            <th>img</th>
            <th>moTaNgan</th>
            <th>moTaChiTiet</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listProduct}" var="sp" varStatus="loop">
            <tr>
                <td>${sp.maSanPham}</td>
                <td>${sp.maDanhmuc}</td>
                <td>${sp.tenSanPham}</td>
                <td>${sp.giaGoc}</td>
                <td>${sp.giaKhuyenMai}</td>
                <td>${sp.donViTinh}</td>
                <td><img src="${sp.img}" width="200" height="200" border="1px"></td>
                <td>${sp.moTaNgan}</td>
                <td>${sp.moTaChiTiet}</td>
                <td><a href="/home?action=edit&index=${loop.index}" class="btn btn-warning">Edit</a></td>
                <td><a href="/home?action=delete&index=${loop.index}" class="btn btn-danger">Delete</a></td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>

</body>
</html>
