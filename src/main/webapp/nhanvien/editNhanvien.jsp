<%--
  Created by IntelliJ IDEA.
  User: johntoan98gmail.com
  Date: 23/12/2022
  Time: 09:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>Edit nhan vien</h1>
<form method="post">
  <input name="id" placeholder="nhập id" value="${nhanvien.id}" readonly><br>
  <input name="tennv" placeholder="nhập name" value="${nhanvien.tennv}"><br>
  <input name="email" placeholder="nhập email" value="${nhanvien.email}"><br>
  <input name="address" placeholder="nhập email" value="${nhanvien.address}"><br>
  <input name="phone" placeholder="nhập phone" value="${nhanvien.phone}"><br>
  <input name="salary" placeholder="nhập luong" value="${nhanvien.salary}"><br>
  <input name="phongBanName" placeholder="nhập price" value="${nhanvien.phongBanName}"><br>
  <button type="submit">Edit</button>
</form>
</body>
</html>
