<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="/webstore/css/bootstrap.min.css">
<script   src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.1/angular.min.js"></script>
<script src="/webstore/js/controllers.js"></script>
 
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Products</h1>
			</div>
		</div>
	</section>
	<section class="container" ng-app="cartApp">
		<div class="row">
			<div class="col-md-5">
			<img src='<c:url value="/img/${product.productId}.png"></c:url>'
							alt="image" style="width: 100%" />
				<h3>${product.name}</h3>
				<p>${product.description}</p>
				<p>
					<strong>Item Code : </strong><span class="label label-warning">${product.productId}</span>
				</p>
				<p>
					<strong>manufacturer</strong> : ${product.manufacturer}
				</p>
				<p>
					<strong>category</strong> : ${product.category}
				</p>
				<p>
					<strong>Availble units in stock </strong> : ${product.unitsInStock}
				</p>
				<h4>${product.unitPrice}USD</h4>
			
				
				<p ng-controller="cartCtrl">
					<a href="<spring:url value="/products" />"
						class="btn btn-default"> <span
						class="glyphicon-hand-left glyphicon"></span> back
					</a> 
					
					<a href="#" class="btn btn-warning btn-large"
						ng-click="addToCart('${product.productId}')"> <span
						class="glyphicon-shopping-cart glyphicon"></span> Order Now
					</a> 
					
					<a href="<spring:url value="/cart"/>" class="btn btn-default">
						<span class="glyphicon-hand-right glyphicon"></span> View Cart
					</a>
					
					
					<a  id ="miClick" class="btn btn-warning btn-large" add-to-cart> <span
						class="glyphicon-shopping-cart glyphicon"></span> ejemplo event
						
						<input type="hidden" id="idProducto" value="${product.productId}"/>
					</a> 

				</p>
				
			</div>
		</div>
	</section>
</body>
</html>
