enchantedApp.directive('home', function() {
    return {
        restrict: 'E',
        templateUrl: 'app/views/home/template/home.template.html',
        controller: function($scope) {
            console.log('Testing this');
            $scope.viewedMovies = [{
                name: 'Lord of The Rings',
                rating: 5,
                comment: "Woop woop"
            },{
                name: 'Harry Potter',
                rating: 4,
                comment: "Woop woop"
            },{
                name: 'Pirates of the caribbean',
                rating: 3,
                comment: "Woop woop"
            },{
                name: 'Interstellar',
                rating: 5,
                comment: "Woop woop"
            }];
        }
    };
});
