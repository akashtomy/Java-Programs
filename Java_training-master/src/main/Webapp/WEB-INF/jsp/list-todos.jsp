
<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>

<div class="conatiner">
	<h1>
		<b>Welcome ${name} :-)</b>
	</h1>
	<h1 align="center">Your TODOS</h1>
</div>

<div class="container jumbotron">
	<table class="table">
		<caption>Your todo are</caption>
		<thead>
			<tr>
				<th>Description</th>
				<th>TargetDate</th>
				<th>Is It Done?</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<!-- 		JSTL Forloop -->
			<!-- 	for(Item item :todos) -->
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.desc}</td>
					<td><fmt:formatDate value="${todo.targetDate}"
							pattern="yyyy-MM-dd" /></td>
					<td>${todo.done}</td>
					<td><a href="/update-todo?id=${todo.id}"
						class="btn btn-primary">UPDATE </a></td>
					<td><a href="/delete-todo?id=${todo.id}"
						class="btn btn-danger">DELETE </a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a class="btn btn-primary" href="/add-todo">Add a TODO</a>
	<div>
<%@include file="common/footer.jspf"%>