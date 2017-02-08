<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<script type ="text/javascript">
function validate(){
var valid= true;
if(formObj.lockID.value==""){

valid=false;
alert("Please Enter Lock ID");

}
return valid;

}
</head>
</script>
	<form:form commandName="editLock" method="post" action="editlock.htm">
	<body bgcolor="#1FB0E0">
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
			<td>Machine Color </td>
			<td><form:input path="machineSIZE"/></td>
		</tr>
	
	<tr>
			<td> Machine Price</td>
			<td><form:input path="machinePrice"/></td>
		</tr>
		<tr>
		<form:hidden path="lockNo"/>
			<td colspan="2"><input type="submit" value="Update" onclick="validate()"></td>
		</tr>
		</table>
		</body>
	</form:form>
	</head>
	</html>