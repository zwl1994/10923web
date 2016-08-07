<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
    <html>  
    <head>  
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
    <title>Insert title here</title>  
   </head>  

<style type="text/css">
table {
	border: 2px #CCCCCC solid;
	width: 720px;
}

td,th {
	height: 30px;
	border: #CCCCCC 1px solid;
}
</style>
<body>
<table align="center">
			<tr>
				
				<th>
					
					<p>	film_id<p>
				
				</th>
				<th>
					<p>	title<p>
				</th>
				<th>
					<p>	description<p>
				</th>
				<th>
					<p>	language<p>
				</th>
				
			</tr>
			
		 <#list list as map> 
			<tr>
				
					
				<#if map.content?exists> 
			 <#assign film=map.content />
					<td>${film.film_id}</td>
			
			
			     	<td>${film.title}</td>
			 
			
			
			 	<td>${film.description}</td>
		
			 
			     
			 		<td>${film.language}</td>
				
			 </#if>
    
				
			</tr>
					
			
			</#list> 
		</table>
</body>
</html>