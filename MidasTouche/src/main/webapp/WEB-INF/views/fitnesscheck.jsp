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
          <option value="RO5">RO5</option>
          <option value="RO1">RO1</option>
    </select>
</div>
<div class="col-md-4" >
    <select class="Centre">
          <option value=''><strong>Centre</strong></option>
    </select>
</div>

<script>
var series = [
	{region: 'RO5', Centre: 'CST'},
	{region: 'RO5', Centre: 'GWH'},
	{region: 'RO1', Centre: 'PV'},
	{region: 'RO1', Centre: 'CP'},
	{region: 'RO1', Centre: 'SE'}
	]

	$(".company").change(function(){
		var company = $(this).val();
		var options =  '<option value=""><strong>Centre</strong></option>';
		$(series).each(function(index, value){
			if(value.region == company){
				options += '<option value="'+value.Centre+'">'+value.Centre+'</option>';
			}
		});
		
		$('.Centre').html(options);
	});


</script>
</body>
</html>