var cartApp = angular.module('cartApp', []);


cartApp.directive("addToCart",['$http',function($http){
	
	return function($scope,element,attrs,$http){
			element.bind("click",function(data){
				var productId = document.getElementById('idProducto');
				
				$scope.addToCart(productId.value);
				
				
				
			});
		
	}
	
	
}]);
													 

cartApp.controller('cartCtrl', function($scope, $http) {
	
	document.querySelector("#miClick").addEventListener("click",function(){
		alert("hola");
});

	$scope.refreshCart = function(cartId) {
        $http.get('/webstore/rest/cart/' + $scope.cartId)
            .success(function(data) {
                $scope.cart = data;
            });
    };

    $scope.clearCart = function() {
        $http.delete('/webstore/rest/cart/' + $scope.cartId)
            .success(function(data) {
                $scope.refreshCart($scope.cartId);
            });
   };

	
    $scope.initCartId = function(cartId) {
        $scope.cartId = cartId;
        $scope.refreshCart($scope.cartId);
   
    };

    $scope.addToCart = function(productId) {
        $http.put('/webstore/rest/cart/add/' + productId)
            .success(function(data) {
                alert("Product Successfully added to the Cart!");
            });
    };
	
    $scope.removeFromCart = function(productId) {
        $http.put('/webstore/rest/cart/remove/' + productId)
            .success(function(data) {
                $scope.refreshCart($scope.cartId);
            });
    };
});

  

   