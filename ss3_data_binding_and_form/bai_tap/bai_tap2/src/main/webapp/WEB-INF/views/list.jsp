<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18/7/2022
  Time: 11:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="" modelAttribute="medicalDeclarationForm" method="post">
<div class="containe ">
    <h1 style="text-align: center">Tờ Khai Y Tế</h1>
    <h3 style="text-align: center">Đây là tài liệu quan trọng,thông tin của anh/chị sẽ giúp cơ quan y tế chúng tôi
        kịp liên lạc khi các bạn bị ngợp xỉu vì kiến thức quá nhiều</h3>
    <p style="color: red;text-align: center">khuyến cáo: khai báo thông tin sai là vi phạm điều luật của lớp và bị
        warning đình chỉ tước xuất học </p>

    <div>
        <p>Họ tên(gi chữ in hoa) <span style="color: red">(*)</span></p>
        <form:input path="name" type="text" class="form-control"/>
    </div>
    <p></p>

    <div class="row">
        <div class="col-lg-4">
            <p>Năm sinh <span style="color: red">(*)</span></p>
            <form:input type="date" path="yearOfBirth" class="form-control"/>
        </div>

        <div class="col-lg-4">
            <p>Giới tính <span style="color: red">(*)</span></p>
            <form:select path="gender" class="form-select">
                <option selected>Choose</option>
                <option value="0">Nữ</option>
                <option value="1">Nam</option>
                <option value="2">lgbt</option>
            </form:select>
        </div>
        <div class="col-lg-4">
            <p>Quốc tịch <span style="color: red">(*)</span></p>
            <form:input path="nationality" type="year" class="form-control"/>
        </div>
    </div>
    <div>
        <p>Sổ hộ chiếu hoặc cmnn giấy hợp pháp khac <span style="color: red">(*)</span></p>
        <form:input path="identityCard" type="text" class="form-control"/>
    </div>
    <div class="row" style="width: 60%">
        <p>thông tin đi lại<span style="color: red">(*)</span></p>
        <div class="col-lg-2">
            <form:radiobutton path="travelInformation" class="form-check-input" label="Tàu bay"/>
        </div>

        <div class="col-lg-2">

            <form:radiobutton path="travelInformation" class="form-check-input" label="Tàu thuyền"/>
        </div>
        <div class="col-lg-2">

            <form:radiobutton path="travelInformation" class="form-check-input" label="ô tô"/>
        </div>
        <div class="col-lg-2">

            <form:radiobutton path="travelInformation" class="form-check-input" label="khác"/>
        </div>


        <%--            private String name;--%>
        <%--            private String yearOfBirth;--%>
        <%--            private String gender;--%>
        <%--            private String nationality;--%>
        <%--            private String identityCard;--%>
        <%--            private String travelInformation;--%>
        <%--            private String vehicleNumber;--%>
        <%--            private String seats;--%>
        <%--            private String departureDay;--%>
        <%--            private String endDate;--%>
        <%--            private String withinDays;--%>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <p>Năm sinh <span style="color: red">(*)</span></p>
            <form:input placeholder="vd:abc1232" path="vehicleNumber" class="form-control"/>
        </div>

        <div class="col-lg-6">
            <p>Giới tính <span style="color: red">(*)</span></p>
            <form:input path="seats" class="form-control"/>
        </div>
    </div>
    <p></p>

    <div class="row">
        <div class="col-6">
            <div class="row">
                <p>ngày khởi hành <span style="color: red">(*)</span></p>
                <div class="col-lg-4">
                    <form:input path="departureDay" id="a" type="number" class="form-control" />
                </div>
                <div class="col-lg-4">

                    <input type="number" class="form-control">
                </div>
                <div class="col-lg-4">
                    <input type="number" class="form-control">
                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="row">
                <p>ngày kết thúc <span style="color: red">(*)</span></p>
                <div class="col-lg-4">
                    <form:input path="endDate" id="a" type="number" class="form-control" />
                </div>
                <div class="col-lg-4">
                    <input type="number"class="form-control">
                </div>
                <div class="col-lg-4 ">
                    <input type="number"class="form-control">
                </div>
            </div>
        </div>
    </div>
    <p></p>
    <div>
        <p>trong bong 14 ngầy <span style="color: red">(*)</span></p>
        <form:input path="withinDays" type="text" class="form-control"/>
    </div>
    <p></p>
    <div>
        <button type="submit">sumid</button>

    </div>
</div>

</form:form>
</body>
</html>
