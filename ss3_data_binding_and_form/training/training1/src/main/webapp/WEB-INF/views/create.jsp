<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/7/2022
  Time: 3:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form:form action="/create" method="post" modelAttribute="EmailBox">
        <table class="table">
            <tr>
                <td>Lenguages:</td>
                <td>
                    <form:select path="lenguages">
                        <form:option value="English">
                            English
                        </form:option>
                        <form:option value="Vietnamese">
                            Vietnamese
                        </form:option>
                        <form:option value="Japanese">
                            Japanese
                        </form:option>
                        <form:option value="Chinese">
                            Chinese
                        </form:option>

                    </form:select>
                </td>
            </tr>
            <tr>
                <td>Page Size :</td>
                <td>
                    <form:select path="pageSize">
                        <form:option value="5">
                            5
                        </form:option>
                        <form:option value="10">
                            5
                        </form:option>
                        <form:option value="15">
                            15
                        </form:option>

                        <form:option value="25">
                            25
                        </form:option>
                        <form:option value="50">
                            50
                        </form:option>
                        <form:option value="100">
                            100
                        </form:option>
                    </form:select>
                </td>
            </tr>

            <tr>
                <td>Spams filter:</td>
                <td><form:checkbox value="on" path="spamsFilter"/>
                    <span> no</span>

                </td>
            </tr>

            <tr>
                <td>Signature</td>
                <td><form:textarea path="signature"></form:textarea></td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit">update</button>
                    <button type="reset" name="/create">huy</button>
                </td>
            </tr>
        </table>
    </form:form>

</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous">

</script>
</html>
