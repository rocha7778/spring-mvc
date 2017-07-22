<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
     <head>
          <meta charset="utf-8">
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta name="viewport" content="width=device-width, initial-scale=1">
          <title>Welcome</title>
           <link rel="stylesheet" href="/webstore/css/bootstrap.min.css">
           <script  src="/webstore/js/jquery-3.2.1.min.js"></script>
           <script  src="/webstore/js/mostrarValor.js"></script>
     </head>
     <body>
     <input type="hidden"  id="valor" value="${valor}" />	
          <div class="jumbotron">
                  <h1> ${greeting} </h1>
                  <p> ${tagline} </p>
          </div>
     </body>
</html>
