<%-- 
    Document   : add
    Created on : 21/01/2020, 12:16:26
    Author     : usuario
--%>

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
                    <h5>Agregar Nuevo Usuario</h5>
                </div>
                 <div class="card-body">
                     <form action = "Controlador">
                         <label>Nombres: </label>
                     <input type = "text" name="txtnom" class=""form-control>  
                     <label>Apellidos:  </label>
                     <input type = "text" name="txtape" class=""form-control> 
                     <input type = "submit" name="accion" value="Guardar"> 
                     <a href="Controlador?accion = index">Regresar</a>
                     </form>
                     
                </div>

            </div>
        </div>
    </body>
</html>

