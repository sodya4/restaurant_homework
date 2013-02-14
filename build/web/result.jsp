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
            double ansTax = (Double)request.getAttribute("answer_Tax");
            out.print(ansTax);
            %>
            <br>
            <%
            double ansTip = (Double)request.getAttribute("answer_Tip");
            out.print(ansTip);
            %>
            <br>
            <%
            double ansTotal = (Double)request.getAttribute("answer_Total");
            out.print(ansTotal);
        %>
        <p><a href="index.jsp">Back to home</p>
    </body>
</html>
