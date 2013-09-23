var app = angular.module('sampleApp', []);

app.config(function($routeProvider){
	$routeProvider
	.when('/main', {
		controller : 'mainController',
		templateUrl : 'asset/app/templates/main.html'
	})
	.otherwise({
		redirectTo: '/main'
	});
});