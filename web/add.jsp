<%-- 
    Document   : add
    Created on : Mar 27, 2017, 1:24:57 PM
    Author     : Evan Stimmel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Player</title>
        <link rel="stylesheet" type="text/css" href="evan.css" />
        
    </head>
    <body>
        <h1>Add A New Player</h1>
        
        <form name="addForm" action="addPlayer" method="get">
            
            <label>Player Name:</label>
            <input type="text" name="name" value="" />
            <br>
            <label>Jersey Number:</label>
            <input type="text" name="number" value="" />
            <br>
            <label>Age:</label>
            <input type="text" name="age" value="" />
            <br>
            <label>Super Bowl Wins:</label>
            <input type="text" name="wins" value="" />
            <br>
            <input type="submit" name="submit" value="Submit" />
        </form>
        
        
        
        
        
    </body>
</html>
