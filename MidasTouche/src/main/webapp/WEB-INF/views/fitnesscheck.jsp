<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div class="col-md-4" >
    <select class="company">
          <option value=''><strong>Name</strong></option>
          <option value="RO5">RO5</option>
          <option value="RO5">RO1</option>
    </select>
</div>
<div class="col-md-4" >
    <select class="product">
          <option value=''><strong>Products</strong></option>
    </select>
</div>
<script>
var series = [
{region: 'RO5', Centre: 'CST', Course: 'GNIIT'},
{region: 'RO5', Centre: 'CST', Course: 'DevOps'},
{region: 'RO5', Centre: 'GWH'},
{region: 'RO1', Centre: 'D CP'},
{region: 'RO1', Centre: 'D PV'},
{region: 'RO1', Centre: 'D SE'}
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