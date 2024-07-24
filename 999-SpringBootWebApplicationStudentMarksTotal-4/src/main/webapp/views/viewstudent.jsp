<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>Display All Student Details</h1>
<table border="1">
    <tr>
        <th>SID</th>
        <th>NAME</th>
        <th>COURSE</th>
        <th>HTML</th>
        <th>SPRING</th>
        <th>SPRING BOOT</th>
        <th>TOTAL</th>
        <th>PERCENTAGE</th>
        <th>GRADE</th>
        <th>RESULT</th>
        <th>EDIT</th>
        <th>DELETE</th>
    </tr>
    <c:forEach var="student" items="${students}">  
            <tr>
                <td>${student.sid}</td>
                <td>${student.name}</td>
                <td>${student.course}</td>
                <td>${student.html}</td>
                <td>${student.spring}</td>
                <td>${student.springboot}</td>
                <td>${student.total}</td>
                <td>${student.percentage}</td>
                <td>${student.grade}</td>
                <td>${student.result}</td>
                <td><a href="/edit/${student.sid}">Edit</a></td>
                <td><a href="/delete/${student.sid}">Delete</a></td>
            </tr>
    </c:forEach>
    <a href="/stuform"">AddNewStudent</a>
</table>
