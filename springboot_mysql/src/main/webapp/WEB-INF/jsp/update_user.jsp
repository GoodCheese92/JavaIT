<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- JSP를 사용할 땐 타임리프를 추가하지 않는다
spring web, spring dev tool, MySQL Driver, Spring Data JPA
-->
<!-- 
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
 -->
 <!-- src/webapp/WEB-INF/jsp/main.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 페이지</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg bg-dark navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Management System</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="/">Management</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<br><br>

<div class="container">
		<div class="row">
			<div class="col-lg-6 col-md-6 col-sm-6 container justify-content-center card">
				<h1 class="text-center">사용자 수정</h1>
				<div class="card-body">
					<form action="<c:url value='/${user.id}'/>" method="POST">
						<div class="form-group">
							<label>name</label>
							<input type="text" name="name"  value="${user.name}" class="form-control" placeholder="Enter Name"/>
							
							<label>gender</label>
							<input type="text" name="gender"  value="${user.gender}" class="form-control" placeholder="Enter Gender"/>
							
							<label>Phone</label>
							<input type="text" name="phone"  value="${user.phone}" class="form-control" placeholder="Enter Phone"/>

							<label>Email</label>
							<input type="text" name="email"  value="${user.email}" class="form-control" placeholder="Enter Email"/>
							
							<div class="box-footer">
								<button type="submit" class="btn btn-primary">수정하기</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
							