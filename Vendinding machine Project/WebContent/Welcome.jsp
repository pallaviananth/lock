<script>  
function validateform(){  
var name= document.getElementById("number").value ;  
var password=document.getElementById("n2").value;  
  
if (!isNaN(name)){  
  alert("Name can't be blank OR Number");  
  return false;  
}else if(password.length<6 ){  
  alert("Password must be at least 6 characters long.");  
  return false;  
  }  

}  

</script>  
<body>  
<form name="myform" method="post" action="index.jsp" onsubmit="return validateform()" >  
Name: <input type="text" name="name" id="number"><br/>   
Password: <input type="password" name="password"id="n2"><br/> 
<input type="submit" value="Login">  
</form> 