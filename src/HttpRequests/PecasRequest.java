package HttpRequests;

import MenuContents.Perfil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Constant;
import models.Pecas;

public class PecasRequest {

    public List<Pecas> getPecas(String biCoordenador) {

        String msg = null;
        List<Pecas> pecas = new ArrayList<>();
        String uri = Constant.domain.DOMAIN + "/api/pecas/listar_pecas_disponiveis/";

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(uri + biCoordenador))
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
            Type pecasList = new TypeToken<ArrayList<Pecas>>() {}.getType();
            pecas = gson.fromJson(msg, pecasList);

            if (pecas.isEmpty()) {
                pecas = null;
            }
        }
        return pecas;
    }
}
