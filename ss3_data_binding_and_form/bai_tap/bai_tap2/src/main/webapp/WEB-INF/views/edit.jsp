<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19/7/2022
  Time: 1:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/edit" method="post" modelAttribute="medicine">
    <div style="text-align: center">
        <p>TỜ KHAI Y TẾ</p>
    </div>
    <div>
        <p>ID</p>
        <form:input path="id" class="form-control" required="required"/>
    </div>
    <div>
        <b>Họ và tên (ghi chữ IN HOA)<span style="color: red">(*)</span>:</b>
        <form:input path="name" class="form-control" required="required"/>
    </div>
    <div>
        <form:input type="date" path="yearOfBirth" class="form-control" required="required"/>
    </div>
    <div>
        <p>Thông tin đi lại</p>
        <form:radiobutton path="vehicle" value="Tàu bay"/>Tàu bay
        <form:radiobutton path="vehicle" value="Tàu thuyền"/>Tàu thuyền
        <form:radiobutton path="vehicle" value="Ô tô"/>Ô tô
        <form:radiobutton path="vehicle" value="Khác (ghi rõ)"/>Khác (ghi rõ)
    </div>
    <div>
        <p>Ngày khởi hành</p>
        <form:input path="" type="date"/>
    </div>
    <div>
        <p>Ngày khởi hành</p>
        <form:input path="dayEnd" type="date"/>
    </div>
    <div>
        <p>Trong vòng 14 ngày qua,Anh/Chị có đến tỉnh/thành phố nào</p>
        <form:input path="activity14Day"/>
    </div>
    <button type="submit">Edit</button>
</form:form>
</body>
</html>
