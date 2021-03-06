<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Java Blog</title>
</head>
<body>
	<h1>Java Blog</h1>
	
	<c:if test="${message != null}">
	   <p>${message}<p>
	</c:if>
	
	<div>
		<h2>Blog posts</h2>
		<ul>
			<c:forEach items="${posts}" var="post">
			    <li> <a href="showPage?id=${post.id}">${post.title}</a> </li>
			</c:forEach>
		</ul>
	</div>
	
	
	<c:if test="${isLoggedin}">
		<div>
			<p>Editor menu</p>
			
			<a href="createPost?type=text">Create text post</a><br>
			<a href="createPost?type=photo">Create photo post</a><br>
			<a href="createPost?type=video">Create video post</a><br>
		</div>
	</c:if>
	
	<c:if test="${isLoggedin == false}">
		<div>
			<form action="login" method="post">
				<input type="text" name="username" placeholder="username"> <br>
				<input type="password" name="password" placeholder="password"> <br>
				<button type="submit">Login</button>
			</form>
		</div>
	</c:if>

</body>
</html>