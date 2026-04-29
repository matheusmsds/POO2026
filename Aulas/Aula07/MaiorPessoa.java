public class MaiorPessoa {

	static Pessoa2 maiorIdade( Pessoa2[] pessoas ) {
		Pessoa2 resposta = pessoas[0];
		
		Pessoa2 tmp;
		for( int i=1; i<pessoas.length; i++) {
			tmp = pessoas[ i ];
			if( tmp.idade > resposta.idade ) {
				resposta = tmp;
			}
		}

		return resposta;
	}

	public static double mediaIdades(Pessoa2[] pessoas) {
		int soma = 0;
		for(int i = 0; i < pessoas.length; i++){
			soma += pessoas[i].idade;
		}

		double media = soma / pessoas.length;

		return media;
	}
	public static void mostrarMenoresMedia(Pessoa2[] pessoas, double media){
		for(int i = 0; i < pessoas.length; i++){
			if (media > pessoas[i].idade) {
				System.out.println(pessoas[i].nome);
			}
		}
	}

}
