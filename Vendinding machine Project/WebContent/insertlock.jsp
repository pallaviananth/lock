<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>	
<html>
<head>

<script type="text/javascript">  
if(formObj.lockID.value==""&&){

	valid=false;
alert("Hello Javatpoint");  
}
return valid;
</script>
</head>

<body bgcolor="	#38c4b6">


<form:form commandName="addLock" method="post" onsubmit="return validate(this);">
		
		<table>
		<tr>
			<td>Machine ID</td>
			<td><form:input path="lockID"/></td>
	    </tr>
	    
	    <tr>
			<td> Machine Kind</td>
			<td><form:input path="machineNAME"/></td>
	    </tr>
	    
	     <tr>
			<td> Machine Color</td>
			<td><form:input path="machineSIZE"/></td>
	    </tr>
	    <tr>
			<td> Machine Price</td>
			<td><form:input path="machinePrice"/></td>
	    </tr>
	    
	    <tr>
	    	<td colspan="2"><input type="submit" value="Add"/></td>
		</tr>
		
		</table>
	</form:form>
	
            
            
         
</body>

</html>	
	