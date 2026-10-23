import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args){
		String url = "jdbc:postgresql://localhost:5432/escola";
		String usuario = "postgres";
		String senha = "postgres";
		
		String nome = "";
		String email = "";
		int idade = 0;
		int id = 0;

		try {
			Connection con = DriverManager.getConnection(url, usuario, senha);
			
			Scanner scanner = new Scanner(System.in);
			int opcao = 0;

			do {
				System.out.println("\n--- MENU DE OPÇÕES ---");
				System.out.println("1 - CADASTRAR ALUNO");
				System.out.println("2 - ALTERAR ALUNO");
				System.out.println("3 - EXCLUIR ALUNO");
				System.out.println("4 - LISTAR ALUNOS");
				System.out.println("5 - SAIR");
				System.out.print("Escolha uma opção: ");

				opcao = scanner.nextInt();

				switch (opcao) {
				case 1:
					nome = scanner.next();
					email = scanner.next();
					idade = scanner.nextInt();
					Funcoes.incluir(con, nome, idade, email);
					break;
				case 2:
					
					nome = scanner.next();
					email = scanner.next();
					idade = scanner.nextInt();
					id = scanner.nextInt();
					Funcoes.alterar(con, id, nome, idade, email);
					break;
				case 3:
					id = scanner.nextInt();
					Funcoes.excluir(con, id);
					break;
				case 4:
					Funcoes.listar(con);
					break;
				case 5:
					System.out.println("Saindo do programa...");
					con.close();
					break;
				default:
					System.out.println("Opção inválida! Tente novamente.");
				}
			} while (opcao != 5);

			scanner.close();

		} catch (SQLException e) {
			System.out.println("Erro ao conectar: " + e.getMessage());
		}
	}
}