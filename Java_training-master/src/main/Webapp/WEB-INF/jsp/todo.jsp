
<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<div class="container">
	<h2>ADD todo page</h2>
	<form:form method="post" modelAttribute="todo">
		<fieldset class="form-group">
			<form:hidden path="id" />
			<form:label path="desc">Description</form:label>
			<form:input path="desc" type="text" class="form-control"
				required="required" />
			<form:errors path="desc" cssClass="text-warning"></form:errors>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="targetDate">Target Date</form:label>
			<form:input path="targetDate" type="date" class="form-control"
				required="required" />
			<form:errors path="targetDate" cssClass="text-warning"></form:errors>
		</fieldset>

		<button class="btn btn-success" type="submit" value="submit">ADD</button>
	</form:form>
</div>
<%@include file="common/footer.jspf"%>

