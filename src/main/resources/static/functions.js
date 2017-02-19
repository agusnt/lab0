var app = angular.module("lab0", [])
app.controller("lab0Ctrl", function($scope, $http)
{
    $scope.get = function(q){
        $http({url: "/search", method: "GET", params: {q: q}}).then(function(response){
            console.log(response.data)
            $scope.res = response.data;
        });
    }
});
