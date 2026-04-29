package exercicio01;

public class Main {
    public static void main(String[] args) {
		Pessoa2 pessoas[] = new Pessoa2[4];
		pessoas[0] = new Pessoa2("ana", 44);
		pessoas[1] = new Pessoa2("bob", 33);
		pessoas[2] = new Pessoa2("carl", 22);
		pessoas[3] = new Pessoa2("dann", 11);

 
		//Pessoa2 result = maiorIdade( pessoas );
		//System.out.println("Pessoa com maior idade abaixo");
		//System.out.println(result);

		double result = MaiorPessoa.mediaIdades(pessoas);
		System.out.println(result);
	}
}
