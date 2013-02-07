<%-- 
    Document   : index
    Created on : Feb 4, 2013, 4:04:58 PM
    Author     : scottodya
--%>

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
            
            <p>Select food
                <!-- the name attribute is set to 'color' which is the
                     parameter to be retrieved by the servlet -->
                <select id="food" name="food" size ="1">
                    <option value="lobster">lobster</option>
                    <option value="steak">steak</option>
                    <option value="salad">salad</option>
                    <option value="beer">beer</option>
                    <option value="soda">soda</option>
                </select>
            </p>
            <p><input id="addItem" name="addItem" type="submit" value="Add Item"></p>
            <p><input id="orderSubmit" name="orderSubmit" type="submit" value="Calculate">
            </p>
        </form>
    </body>
</html>
