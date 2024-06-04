import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class Conversao {

    //String endereco;
    public int opcao;
    public String moeda;

    public double Converter(double valor, String moedaOrigem) {

        String link = "https://v6.exchangerate-api.com/v6/d550f7e12c5ed7ae88ad0efe/latest/" + moedaOrigem;
        URI endereco = URI.create(link);


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Valor valorObj = new Gson().fromJson(response.body(), Valor.class);
            double taxaDeCambio = valorObj.conversion_rates.get(moeda);
            return valor * taxaDeCambio;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro na conversão de moeda", e);
        }
    }
}
