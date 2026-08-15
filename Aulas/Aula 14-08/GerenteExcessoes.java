package poo1408;

public class GerenteExcessoes {
	public void tratar_excessao(Exception ex) {
		System.out.println("O seu pola deu erro ai, oia essa desnara:");
		System.out.println(ex.getMessage());
	}
}
