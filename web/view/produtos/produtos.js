app.controller("produtosCTRL", function ($scope, $http) {
	$scope.produtosView = [
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Paraná", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Brasil", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Brasil", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Brasil", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Brasil", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Brasil", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Brasil", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Brasil", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Brasil", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Brasil", fotoUrl: "http://placehold.it/750x500" },
		{ nome: "Ração", loja: "Loja Raçãozinha", estado: "Brasil", fotoUrl: "http://placehold.it/750x500" }
	];

	$scope.salvarAnuncio = function(adocao){
		console.log(adocao);
	}
	$scope.carregarFoto = function(foto){
		$scope.photoUrl = foto;
		console.log(foto);
	}

	/*var carregaDados = function(){
			$http.get("https://api.github.com/gists/public").then(function (response) {
        		$scope.adoteView = response.data;
        		console.log($scope.adoteView);
			});
	}

	carregaDados(); */


})