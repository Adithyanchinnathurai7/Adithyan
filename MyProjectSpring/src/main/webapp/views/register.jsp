<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form action="/mcr/first" method="post" modelAttribute="userobj">
		
		UserName:<form:input type="text" path="username" /><br>
		<form:errors path="uname"></form:errors>
		Password:<input type="password" name="password1"/><br>	
		Re-Enter PassWord:<input type="password" name="password2"/><br>	
		Email:<form:input type="email" path="email"/><br>
		City:<form:input type="text" path="city"/><br>
		Address:<form:input type="text" path="address"/><br>
		Phone:<form:input path="phone"/><br>		
		Image:<form:input type="file" path="img"/><br>	
	
		<right><input type="Submit" value="click"><br></right>
</form:form>