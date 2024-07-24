<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
    <h2>Edit Student Form</h2>
 
    <form:form action="/updateandsave">
        <table>
            <tr>
                <td>Id:</td>
                <td><form:hidden path="sid" /></td>  
            </tr>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>  
            </tr>
            <tr>
                <td>Course:</td>
                <td><form:input path="course" /></td>  
            </tr>
            <tr>
                <td>HTML marks:</td>
                <td><form:input path="html" /></td>  
            </tr>
            <tr>
                <td>Spring Marks:</td>
                <td><form:input path="spring" /></td>  
            </tr>
            <tr>
                <td>Spring boot Marks:</td>
                <td><form:input path="springboot" /></td>  
            </tr>
            <tr>
                <td><input type="submit" name="submit" value="EditAndSave"></td>
            </tr>
            <tr>
        </table>
    </form:form>
    <a href="/stufrom">AddNewUser</a>
