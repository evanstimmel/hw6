<%-- 
    Document   : updateForm
    Created on : Mar 28, 2017, 5:27:16 PM
    Author     : Evan Stimmel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Players"%>
<% Players player = (Players) request.getAttribute("player"); %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="evancss.css" />
        <title>Update Players</title>
    </head>
    <body>
   
        <h1>Update A New Player</h1>
        
        <form name="updateForm" action="updatePlayer" method="get">
            
            <label>Player ID:</label>
            <input type="text" name="id" value="<%= player.getPlayerID() %>" readonly/>
            <br>
            <label>Player Name:</label>
            <input type="text" name="name" value="<%= player.getPlayerName() %>" />
            <br>
            <label>Jersey Number:</label>
            <input type="text" name="number" value="<%= player.getJerseyNumber() %>" />
            <br>
            <label>Age:</label>
            <input type="text" name="age" value="<%= player.getAge() %>" />
            <br>
            <label>Super Bowl Wins:</label>
            <input type="text" name="wins" value="<%= player.getSuperbowlWins() %>" />
            <br>
            <input type="submit" name="submit" value="Update" />
        </form>
    </body>
</html>
