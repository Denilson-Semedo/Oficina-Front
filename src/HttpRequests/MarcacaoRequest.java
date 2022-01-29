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
import models.Marcacao;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

public class MarcacaoRequest {

    public void setMarcacao(Marcacao marcacao) throws IOException, InterruptedException {
        String msg = null;
        Gson gson = new Gson();
        String requestBody = gson.toJson(marcacao);
        String uri = Constant.domain.DOMAIN + "/api/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .uri(URI.create(uri))
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    }

    public List<Marcacao> getMarcacao() {

        String msg = null;
        ArrayList<Marcacao> marcacao = new ArrayList<>();
        String uri = Constant.domain.DOMAIN + "/api/marcacao/lista_marcacao";

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
            Logger.getLogger(MarcacaoRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(MarcacaoRequest.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (msg != null) {
            var gson = new Gson();
            Type marcacaoList = new TypeToken<ArrayList<Marcacao>>() {}.getType();
            marcacao = gson.fromJson(msg, marcacaoList);

            if (marcacao.isEmpty()) {
                marcacao = null;
            }
        }
        return marcacao;
    }
}
