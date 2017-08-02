<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Manager Home</title>
    </head>
    <body>
        <div align="center">
            <h1>Contact List</h1>
            <h3><a href="/newContact">New Contact</a></h3>
            <table border="1">
                <th>Country Id</th>
                <th>Country Name</th>
                <th>Region Id</th>
                 
                <c:forEach var="countri" items="${listContact}" varStatus="status">
                <tr>
                    <td>${countri.countryId}</td>
                    <td>${countri.countryName}</td>
                    <td>${countri.regionId}</td>
                             
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>