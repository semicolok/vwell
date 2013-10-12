app.controller('mainController', function($scope, $location) {
	$scope.addForm = function(){
		$('#addVaccineformModal').modal('show');
	};
});