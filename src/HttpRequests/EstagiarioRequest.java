package HttpRequests;

import MenuContents.Perfil;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Constant;
import models.Estagiario;

public class EstagiarioRequest {

    public Estagiario getInfoEfetivo(String username) {

        String msg = null;
        Estagiario estagiario = null;
        String uri = Constant.domain.DOMAIN + "/api/estagiario/get_estagiario_by_username/";

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(uri + username))
                .header("accept", "application/json")
                .build();

        HttpClient httpClient = HttpClient.newBuilder().build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            msg = response.body();

        } catch (IOException ex) {
            Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (msg != null) {
            var gson = new Gson();
            estagiario = gson.fromJson(msg, models.Estagiario.class);
        }
        return estagiario;
    }
    
    public void atualizarPerfilMecanicoEstagiario(Estagiario estagiario, boolean passwordChange) throws IOException, InterruptedException {

        Gson gson = new Gson();
        String requestBody = gson.toJson(estagiario);
        String uri = Constant.domain.DOMAIN + "/api/estagiario/atualizar_estagiario/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .uri(URI.create(uri + passwordChange))
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
