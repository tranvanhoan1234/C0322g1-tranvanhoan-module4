<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/7/2022
  Time: 10:15 PM
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
<form action="/sandwich" method="post">

    <div class="form-check form-check-inline">
        <input class="form-check-input" name="condiment" type="checkbox" id="inlineCheckbox1" value="lettuce">
        <label class="form-check-label" for="inlineCheckbox1">Lettuce</label>
    </div>
    <div class="form-check form-check-inline">
        <input class="form-check-input" name="condiment" type="checkbox" id="inlineCheckbox2" value="Tomato">
        <label class="form-check-label" for="inlineCheckbox2">Tomato</label>
    </div>
    <div class="form-check form-check-inline">
        <input class="form-check-input" name="condiment" type="checkbox" id="inlineCheckbox3" value="mustard">
        <label class="form-check-label" for="inlineCheckbox3">Mustard</label>
    </div>
    </div>
    <div class="form-check form-check-inline">
        <input class="form-check-input" name="condiment" type="checkbox" id="inlineCheckbox4" value="sprouts">
        <label class="form-check-label" for="inlineCheckbox4">Sprouts</label>
    </div>
    <div>
        <p>${s}</p>

    </div>

    <button type="submit" value="saver">save</button>
    </div>
    <form action="" method="post">
        <input type="text" name="soMot">
        <input type="text" name="soHai">
        <button name="calculation" value="+">+</button>
        <button name="calculation" value="-">-</button>
        <button name="calculation" value="*">*</button>
        <button name="calculation" value="/">/</button>
        <div><p>Result Division ${result}</p></div>
    </form>
</form>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
