package work_whis_http_api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpDemo {
    private static String apiM = "https://api.monobank.ua/bank/currency";
    private static String apiN = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchangenew?json";
    private static String apiP = "https://api.privatbank.ua/p24api/pubinfo?exchange&json&coursid=12";

    public static void main(String[] args) throws IOException, InterruptedException {


        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(apiM))
                .GET()
                .build();
        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println("Haters: " + httpResponse.headers());
        System.out.println("Body: " + httpResponse.body());
        System.out.println("statusCode= " + httpResponse.statusCode());
    }
}
