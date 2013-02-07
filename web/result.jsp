<%-- 
    Document   : result
    Created on : Feb 4, 2013, 4:05:37 PM
    Author     : scottodya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Page</title>
    </head>
    <body>
        <h2 align="center">Answer</h2>
        <hr/>
        <%
            double ans = (Double)request.getAttribute("answer");
            out.print(ans);
        %>
        <p><a href="form.html">Back to Calculators</p>
    </body>
</html>
