
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="evancss.css"/>
        <title>JSP Page</title>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    
    <body>
        <h1>Evan's Players</h1>
        <%= table %>
        
        <br><br>
        
        <a href ="add">Add A New Player</a>
        <br> <br>
        <a href="search.jsp">Search Players</a>
        
        
    </body>
</html>
