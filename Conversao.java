import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversao {

    //String endereco;
    int opcao;

    public Valor Converter(double valor) {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/d550f7e12c5ed7ae88ad0efe/latest/USD" + opcao);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco).build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Opção Inválida");
        }

        //return new Gson().fromJson(response.body(), Valor.class);
    }
}
