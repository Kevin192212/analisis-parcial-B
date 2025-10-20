import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class Mainl {
    public static void main(String[] args) {
        try {
            // 1️⃣ Crear el cliente
            HttpClient client = HttpClient.newHttpClient();

            // 2️⃣ Crear la solicitud (GET)
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.chucknorris.io/jokes/random"))
                    .GET()
                    .build();

            // 3️⃣ Enviar la solicitud y recibir la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // 4️⃣ Mostrar la respuesta JSON
            System.out.println("Código de respuesta: " + response.statusCode());
            System.out.println("Cuerpo de la respuesta:");
            System.out.println(response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
