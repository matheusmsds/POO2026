import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;

public class AbrirJson {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("pessoa.json");

        JsonObject jsonCompleto = JsonParser.parseReader(reader).getAsJsonObject();
        Gson gson = new Gson();

        for (String nome : jsonCompleto.keySet()) {
            Pessoa p = gson.fromJson(jsonCompleto.get(nome), Pessoa.class);
            System.out.println(nome + " -> " + p);
        }
    }
}
