<%-- 
    Document   : listar productos
    Created on : 3/07/2024, 09:44:24
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
            <nav class="navbar navbar-dark bg-dark">
            <div class="container-fluid">
              <a class="navbar-brand" href="#">Sistema de listado de productos</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
                <div class="offcanvas-header">
                  <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Dark offcanvas</h5>
                  <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                </div>
                <div class="offcanvas-body">
                  <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                    <li class="nav-item">
                      <a class="nav-link active" aria-current="page" href="../index.jsp">Inicio</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link"  href=".././Formulario Productos/formulario producto.jsp">Formulario Producto</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="lista productos.jsp">Lista Productos</a>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
        </nav>
        <div class="container-fluid mt-5">
            <table class="table table-striped border border-success border-5">
                <thead><th> #</th><th> Nombre</th><th> Descripcion</th><th> Marca</th><th> Precio</th></thead>
                <tbody>
                    <tr><td>1</td><td>Leche</td><td>bebida lactea con vitaminas A, B12 y riboflavina</td><td>Otuc</td><td>Q30.00</td></tr>
                    <tr><td>2</td><td>Miel</td><td>Miel de abeja real</td><td>Castañeda</td><td>Q25.00</td></tr>
                    <tr><td>3</td><td>yogurt</td><td>yogurt girego</td><td>Perez</td><td>Q15.00</td></tr>
                </tbody>
            </table>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

    </body>
</html>
