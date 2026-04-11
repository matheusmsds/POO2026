// este arquivo vai do exercico 12 até 14
public class exe05 {
    public static void main(String[] args) {
        String nomes [] = {"Matheus", "Tadeu", "Bob"};
        double notas [] = {6.0, 7.0, 6.0};

        double maiorNota = notas[0];
        int indice = 0;
        for(int i = 0; i < notas.length; i++){
            if (maiorNota < notas[i]) {
                indice = i;
            }
        }
        System.out.println(nomes[indice]);
    }
}
