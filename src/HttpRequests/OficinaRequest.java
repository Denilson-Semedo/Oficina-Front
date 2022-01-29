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
import models.Oficina;

public class OficinaRequest {
    
    public Oficina getOficina(String username) {

        String msg = null;
        Oficina oficina = null;
        String uri = Constant.domain.DOMAIN + "/api/oficina/get_oficinas_by_coordenador/";

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(uri + username))
                .header("accept", "application/json")
                .build();

        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpResponse<String> response;
        
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            msg = response.body();
        } catch (IOException ex) {
            Logger.getLogger(OficinaRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(OficinaRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
            

        if (msg != null) {
            var gson = new Gson();
            oficina = gson.fromJson(msg, models.Oficina.class);
        }
        
        return oficina;
    }
}
