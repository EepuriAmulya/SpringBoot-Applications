<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
    <h2>Edit User Form</h2>
 
    <form:form method="POST" action="/updateandsave">
        <table>
            <tr>
                <td>EmpNo:</td>
                <td><form:hidden path="empNo" /></td>  
            </tr>
            <tr>
                <td>EmpName:</td>
                <td><form:input path="empName" /></td>  
            </tr>
            <tr>
                <td>Department:</td>
                <td><form:input path="department" /></td>  
            </tr>
            <tr>
                <td>Salary:</td>
                <td><form:input path="salary" /></td>  
            </tr>
            
                <td><input type="submit" name="submit" value="EditAndSave"></td>
            </tr>
            <tr>
        </table>
    </form:form>