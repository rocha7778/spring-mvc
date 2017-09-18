$(document).ready(function() {
	
	consultarCiudadJson()
});


function consultarCiudadJson(){
	
	var data = {
			 countryId:"1",
			 countryName : "rocha",
			 regionId : "1"
			
	};
	
	$.ajax({
		async:true,
		type : "POST",
		url : "http://localhost:8080/webstore/miJson",
		data: JSON.stringify(data),
		dataType : 'json',
		contentType: "application/json",
		success : function(data) {
			console.log(data);
			
		}
		
	});
	
}

