<%-- 
    Document   : result
    Created on : Feb 4, 2013, 4:05:37 PM
    Author     : scottodya
--%>

<%@page import="java.text.NumberFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Page</title>
    </head>
    <body>
        <h2 align="center">Receipt</h2>
        <hr/>
        <p>You ordered the following items:</p>
        <p><%
            for (String aItemName : request.getParameterValues("menuItems")) {
                out.print(aItemName);%><br>
            <%
                }
            %></p>
        <table>
            <tr>
                <td>Your tax is:</td>
                <td>
                    <%
                        NumberFormat nf = NumberFormat.getCurrencyInstance();

                        double ansTax = (Double) request.getAttribute("answer_Tax");
                        out.print(nf.format(ansTax));
                    %>
                </td>
            </tr>
            <tr>
                <td>Your tip is:</td>
                <td>
                    <%
                        double ansTip = (Double) request.getAttribute("answer_Tip");
                        out.print(nf.format(ansTip));
                    %>
                </td>
            </tr>
            <tr>
                <td>Your total is:</td>
                <td>
                    <%
                        double ansTotal = (Double) request.getAttribute("answer_Total");
                        out.print(nf.format(ansTotal));
                    %>
                </td>
            </tr>
        </table>
        <p><a href="index.jsp">Back to home</p>
    </body>
</html>
