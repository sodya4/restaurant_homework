<%-- 
    Document   : index
    Created on : Feb 4, 2013, 4:04:58 PM
    Author     : scottodya
--%>

<%@page import="java.util.List"%>
<%@page import="model.MenuItems"%>
<%@page import="model.FakeDatabase"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.awt.MenuItem"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Restaurant Calculator</title>
    </head>
    <body>
        <h2>Restaurant Calculator</h2>

        <form id="form1" name="form1" method="POST" action="CalculatorController">

                <%
                    NumberFormat nf = NumberFormat.getCurrencyInstance();
                    FakeDatabase fdb = new FakeDatabase();
                    for (MenuItems menuItems : fdb.getMenuItems()) {
                        String itemName = menuItems.getItemName();
                        double itemPrice = menuItems.getItemPrice();
                %>

                <!-- Remember, using the %= notation below is a shortcut for out.print -->
                <input type="checkbox" name="menuItems" value="<%= itemName%>" /> <%= (itemName + ", " + nf.format(itemPrice))%><br/>

                <%
                    }
                %>

            </select>
        </p>
        <!--
        <p><input id="addItem" name="addItem" type="submit" value="Add Item"></p>
        -->
        <p><input id="order" name="order" type="submit" value="Submit">
        </p>
    </form>
</body>
</html>
