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
      <form:form  method="POST" modelAttribute="newCountry" class="form-horizontal" >
         <fieldset>
            <legend>Add new Countries</legend>

            <div class="form-group">
               <label class="control-label col-lg-2 col-lg-2" for="countryId">Country Id</label>
               <div class="col-lg-10">
                  <form:input id="countryId" path="countryId" type="text" class="form:input-large"/>
               </div>
            </div>
            
             <div class="form-group">
               <label class="control-label col-lg-2 col-lg-2" for="countryName"> Contry Name</label>
               <div class="col-lg-10">
                  <form:input id="countryName" path="countryName" type="text" class="form:input-large"/>
               </div>
            </div>
             <div class="form-group">
               <label class="control-label col-lg-2 col-lg-2" for="regionId">Region Id</label>
               <div class="col-lg-10">
                  <form:input id="regionId" path="regionId" type="text" class="form:input-large"/>
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
