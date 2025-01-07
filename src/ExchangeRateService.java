import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class ExchangeRateService {
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private String apiKey;

    public ExchangeRateService(String apiKey) {
        this.apiKey = apiKey;
    }

    public double getConversionRate(String fromCurrency, String toCurrency) throws Exception {
        String url = BASE_URL + apiKey + "/pair/" + fromCurrency + "/" + toCurrency;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
        if (jsonResponse.has("conversion_rate")) {
            return jsonResponse.get("conversion_rate").getAsDouble();
        } else {
            throw new Exception("No se pudo obtener la tasa de conversión.");
        }
    }
}

