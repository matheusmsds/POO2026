package exes.exe01;

public class Principal {
   public static void main(String[] args) {
        Estudante [] estudantes = null;
        estudantes = carregar_lista_estudantes(estudantes);

        for (int i = 0; i < estudantes.length; i++){
            Estudante est = estudantes[i];
            System.out.print(est);
        }
   }
   public static Estudante [] carregar_lista_estudantes(Estudante [] estudantes){

        Estudante p1 = new Estudante("Carl", 18);
        Estudante p2 = new Estudante("Ana", 18);
        Estudante p3 = new Estudante("Bob", 18);

        Estudante [] vet = {p1, p2, p3};

        return vet;
       
   }
}
