<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/webstore/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
   <section>
      <div class="jumbotron">
         <div class="container">
            <h1>Customer</h1>
            <p>Add customer</p>
         </div>
      </div>
   </section>
   <section class="container">
      <form:form  method="POST" modelAttribute="newCustomer" class="form-horizontal" >
         <fieldset>
            <legend>Add new Customer</legend>

            <div class="form-group">
               <label class="control-label col-lg-2 col-lg-2" for="productId">Customer Id</label>
               <div class="col-lg-10">
                  <form:input id="customerId" path="id" type="text" class="form:input-large"/>
               </div>
            </div>
            
             <div class="form-group">
               <label class="control-label col-lg-2 col-lg-2" for="name">Name</label>
               <div class="col-lg-10">
                  <form:input id="name" path="name" type="text" class="form:input-large"/>
               </div>
            </div>
             <div class="form-group">
               <label class="control-label col-lg-2 col-lg-2" for="unitPrice">Address</label>
               <div class="col-lg-10">
                  <form:input id="addres" path="addres" type="text" class="form:input-large"/>
               </div>
            </div>
            
            	
            <div class="form-group">
               <div class="col-lg-offset-2 col-lg-10">
                  <input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
               </div>
            </div>
         </fieldset>
      </form:form>
   </section>
</body>
</html>
