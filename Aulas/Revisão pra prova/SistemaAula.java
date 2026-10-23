import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SistemaAula {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/sistema_aula",

					"postgres",

					"postgres");

			System.out.println("Conectou e sem erros! SUCESSO!");

			// SELECT

			String consultaSQL = "SELECT * FROM produtos";
			PreparedStatement sql = con.prepareStatement(consultaSQL);
			ResultSet resultado = sql.executeQuery();

			while (resultado.next()) {

				int id = resultado.getInt("id");
				String n = resultado.getString("nome");
				double p = resultado.getDouble("preco");
				int q = resultado.getInt("qtde");
				Date data = resultado.getDate("data_vencimento");
				
				String textoData[] = data.toString().split("-");
				String dataBrasil =  textoData[2] + "/" + textoData[1] + "/" + textoData[0];

				System.out.println("PRODUTO: " + n);
				System.out.println("ID: " + id);
				System.out.println("Preço: R$ " + String.format("%.2f", p));
				System.out.println("Quantidade: " + q);
				System.out.println("Data de Vencimento: " + dataBrasil);
				System.out.println("------------------------------------");
			}
		}
		catch (SQLException erro) {
			System.out.println(erro.getMessage());
			
		}
		
	}
	
}