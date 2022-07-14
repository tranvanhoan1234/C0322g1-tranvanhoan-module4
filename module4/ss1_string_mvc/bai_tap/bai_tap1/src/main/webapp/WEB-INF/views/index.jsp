<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/7/2022
  Time: 8:43 PM
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
  <h1> chuyển đổi tiền tệ  </h1>

  <form action="" method="post">
  <div class="container">
  <div> usd <input type="text" name="usd1" value="${usd}" placeholder="usa">
  </div>
    <div>vnd
    <input type="text" name="vnd" value="${vnd}" placeholder="vnd" ></div>
    <button type="submit" >submit </button>
  </div>
  </form>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

  </body>
</html>
