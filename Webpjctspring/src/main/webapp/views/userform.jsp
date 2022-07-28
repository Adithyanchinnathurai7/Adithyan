<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form action="/form1/register" method="post" modelAttribute="userobj">

	UserName:<form:input path="uname" />
	<form:errors path="uname"></form:errors>
	PossWord:<form:input path="upass"/>
	Email:<form:input path="email"/>
	Phone:<form:input path="phone"/>
	
	<input type="Submit" value="Click">
</form:form>