<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/7/2022
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form action="" method="post">
    <input type="number" required value="${one}"   name="one">
    <input type="number" required value="${tow}"  name="tow">
    <button type="submit " name="calculation" required value="+">+</button>
    <button type="submit" name="calculation" required value="-"> -</button>
    <button type="submit" name="calculation" required value="*"> *</button>
    <button type="submit" name="calculation" required value="/"> /</button>
    <p>${total}</p>
    <h3>Errors : ${alert} </h3>

</form>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
