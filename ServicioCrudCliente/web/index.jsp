<%-- 
    Document   : index
    Created on : 21/01/2020, 11:07:41
    Author     : usuario
--%>


<%@page import="java.util.List"%>
<%@page import="webservice.User"%>
<%@page import="Modelo.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body style="background-color:#DDACA1">
        <h1 align="center">INAMI Esfot</h1>
        
        <div class="container mt-4">
            <div class="card">
                <div class="card-header" align="right">
                    <a href="Controlador?accion=add" >Nuevo Usuario</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NOMBRES </th>
                                <th>APELLIDOS </th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                UserService user = new UserService();
                                List<User> datos = user.operation();
                                for (User u : datos) {


                            %>
                            <tr>
                                <td><%=u.getId()%></td>
                                <td><%=u.getFname()%></td>
                                <td><%=u.getLname()%></td>
                                <td>
                                    <a href = "Controlador?accion=editar&id=<%=u.getId()%>" class = "btn btn-warning">Edit</a>
                                    <a href = "Controlador?accion=eliminar&id=<%=u.getId()%>" class = "btn btn-danger">Delete</a>
                                </td>
                            </tr>
                            <%}%>

                        </tbody>
                    </table>
                </div>

            </div>
        </div>
        <div align ="center"> 
            <button type="button" class="btn btn-light"><a href="http://localhost/Clima/" target="_blank">consultar el clima</a></button> </div>

    </body>
</html>
