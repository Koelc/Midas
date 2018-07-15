<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="col-md-4" >
    <select class="company">
          <option value=''><strong>Name</strong></option>
          <option value="Company A">Company A</option>
          <option value="Company B">Company B</option>
    </select>
</div>
<div class="col-md-4" >
    <select class="product">
          <option value=''><strong>Products</strong></option>
    </select>
</div>

<script>
var series = [
	{name: 'Company A', product: 'A1'},
	{name: 'Company A', product: 'A2'},
	{name: 'Company A', product: 'A3'},
	{name: 'Company B', product: 'B1'},
	{name: 'Company B', product: 'B2'}
	]

	$(".company").change(function(){
		var company = $(this).val();
		var options =  '<option value=""><strong>Products</strong></option>';
		$(series).each(function(index, value){
			if(value.name == company){
				options += '<option value="'+value.product+'">'+value.product+'</option>';
			}
		});
		
		$('.product').html(options);
	});


</script>
</body>
</html>