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
import models.Servico;

public class ServicosRequest {

    public List<Servico> getServicos() {

        String msg = null;
        List<Servico> servico = new ArrayList<>();
        String uri = Constant.domain.DOMAIN + "/api/servico/listar_servicos";

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(uri))
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
            Type servicosList = new TypeToken<ArrayList<Servico>>() {}.getType();
            servico = gson.fromJson(msg, servicosList);

            if (servico.isEmpty()) {
                servico = null;
            }
        }
        return servico;
    }
}
