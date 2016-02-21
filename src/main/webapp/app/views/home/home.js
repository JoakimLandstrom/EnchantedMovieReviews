enchantedApp.config(['$stateProvider', '$urlRouterProvider',
    function($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise('/');
        $stateProvider
            .state('home', {
                url: '/',
                views: {
                    content: {
                        templateUrl: 'app/views/home/home.html'
                    },
                    navbar:{
                      templateUrl: 'app/components/navbar/navbar.html'
                    }
                }
            });
    }
]);
