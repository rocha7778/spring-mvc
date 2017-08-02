<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/webstore/resources/css/bootstrap.min.css">
<title>Products</title>
</head>

<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Customers</h1>
				<p>History Customer</p>
			</div>
		</div>
	</section>

	<section>
		<div class="row">
			<c:forEach items="${customers}" var="customer">
				<div class="col-sm-6 col-md-3">
					<div class="thumnnail">
						<div class="caption">
							<h3>id: ${customer.id}</h3>
							<p>name: ${customer.name}</p>
							<p>Address: ${customer.addres}</p>
							<p>Number of Order made ${customer.noOfOrdersMade} made</p>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>