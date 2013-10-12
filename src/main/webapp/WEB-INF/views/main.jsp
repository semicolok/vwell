<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html data-ng-app="vwellApp">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<script src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
	<link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
	<link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css" rel="stylesheet">
	<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>
	
	<style type="text/css">
		body {
			padding-top: 70px;
		}
		
		footer {
			padding-left: 15px;
			padding-right: 15px;
		}
	</style>
	
	<title>V-Well</title>
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">V-Well</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a data-ng-href="#/main">Home</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
	<div class="container">
		<div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
			<h4>V-Well</h4>
			<h5 style="background-color:black; color: white">Services</h5>
			<div class="well sidebar-nav">
				<ul class="nav">
					<li><a data-ng-href="#/main">Vaccine</a></li>
					<li><a data-ng-href="#/healthCenter">HealthCenter</a></li>
					<li><a data-ng-href="#/hospital">Hospital</a></li>
				</ul>
			</div>
		</div>
	<div data-ng-view></div>
	<footer>
		<p>&copy; super app korea 2013</p>
	</footer>
	</div>

<script src="asset/app/app.js"></script>
<script src="asset/app/controllers/controllers.js"></script>
</body>
</html>