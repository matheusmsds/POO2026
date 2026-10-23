import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Funcoes {

	public static void incluir(Connection con, String nome, int idade, String email) throws SQLException {

		String sql = "INSERT INTO aluno (nome, idade, email) VALUES (?, ?, ?)";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, nome);
			stmt.setInt(2, idade);
			stmt.setString(3, email);

			stmt.executeUpdate();
		}
	}

	public static void alterar(Connection con, int id, String nome, int idade, String email) throws SQLException {

		String sql = "UPDATE aluno SET nome = ?, idade = ?, email = ? WHERE id = ?";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, nome);
			stmt.setInt(2, idade);
			stmt.setString(3, email);
			stmt.setInt(4, id);

			stmt.executeUpdate();
		}
	}

	public static void excluir(Connection con, int id) throws SQLException {

		String sql = "DELETE FROM aluno WHERE id = ?";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);

			stmt.executeUpdate();
		}
	}

	public static void listar(Connection con) throws SQLException {
		String sql = "SELECT * from aluno";
		try (Statement sqlc = con.createStatement()) {
			ResultSet result = sqlc.executeQuery(sql);

			while (result.next()) {
				int id = result.getInt("id");
				String nome = result.getString("nome");
				String email = result.getString("email");
				int idade = result.getInt("idade");

				System.out.println("ID: " + id);
				System.out.println("Nome: " + nome);
				System.out.println("E-mail: " + email);
				System.out.println("Idade: " + idade);
				System.out.println("--------------------");
			}

		}
	}
}
