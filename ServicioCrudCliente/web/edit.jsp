<%-- 
    Document   : edit
    Created on : 21/01/2020, 12:58:31
    Author     : usuario
--%>

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
    <body>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                    <h5>Actualizar Nuevo Usuario</h5>
                </div>
                <%
                    int id= Integer.parseInt((String) request.getAttribute("iduser"));
                    UserService user= new UserService();
                    User u = user.listarID(id);     
                %>
                
                 <div class="card-body">
                     <form action = "Controlador">
                     <label>Id: </label>
                     <input type = "text" value="<%=u.getId()%>" name="txtid" readonly="" class=""form-control value = "">  
                     
                     <label>Nombres: </label>
                     <input type = "text" value="<%=u.getFname()%>" name="txtnom" class=""form-control value = "">  
                     <label>Apellidos:  </label>
                     <input type = "text" value="<%=u.getLname()%>" name="txtape" class=""form-control> 
                     <input type = "submit" name="accion" value="Actualizar"> 
              
                     </form>
                     
                </div>

            </div>
        </div>
    </body>
</html>
