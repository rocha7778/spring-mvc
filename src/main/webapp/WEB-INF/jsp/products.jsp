<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

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
				<h1>Products</h1>
				<p>All the available products in our store</p>
			</div>
		</div>
	</section>

	<section>
		<div class="row">
			<c:forEach items="${products}" var="product">
				<div class="col-sm-6 col-md-3">
					<div class="thumnnail">
					<img src='<c:url value="/img/${product.productId}.png"></c:url>'
							alt="image" style="width: 100%" />
						<div class="caption">
							<h3>
								<b>Name Product:</b> ${product.name}
							</h3>
							<p>
								<b>Description Product:</b> ${product.description}
							</p>
							<p>
								<b>Price Product:</b> $ ${product.unitPrice}
							</p>
							<p>
								<b>Available </b>${product.unitsInStock} unit in stock
							</p>

							<p>
								<a
									href=" <spring:url value="/product?id=${product.productId}" /> "
									class="btn btn-primary"> <span
									class="glyphicon-info-sign glyphicon" /></span> Details
								</a>
							</p>

						</div>
					</div>


				</div>
			</c:forEach>
		</div>
	</section>
</body>