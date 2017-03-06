<html ng-app="myApp">
<head>
<base href="/Spring4MVCHelloworldDemo/">
<meta charset="utf-8">
<title>Service App</title>
<link rel="stylesheet" href="static/components/bootstrap/dist/css/bootstrap.css" />
<link href="static/css/app.css" rel="stylesheet"></link>
<script src="static/components/angular/angular.js"></script>
<script src="static/components/angular-route/angular-route.js"></script>
<script src="static/js/app.js"></script>
<script src="static/js/service/ItemService.js"></script>
</head>
<body>

	<div class="generic-container">
		<h2>SellPoint - AngularJS Routing Application</h2>
		<div class="panel panel-default">
			<!-- Default panel contents -->
			<div class="panel-heading">
				<span class="lead">All Items</span>
			</div>
			<div class="tablecontainer">
				<ul>
					<li><a href="#/items/computers">Computers</a></li>
					<li><a href="#/items/phones">Phones</a></li>
					<li><a href="#/items/printers">Printers</a></li>
					<li><a href="#/items/others">Others</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div ng-view></div>


	<script src="static/js/controller/ItemListController.js"></script>
	<script src="static/js/controller/ItemDetailsController.js"></script>

</body>
</html>