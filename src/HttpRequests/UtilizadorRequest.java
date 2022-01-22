package HttpRequests;

import MenuContents.Perfil;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Constant;

public class UtilizadorRequest {

    public boolean validarPassAtual(String passAtual, String username) {

        String msg = null;
        boolean passValid = false;
        String uri = Constant.domain.DOMAIN + "/api/utilizador/validarPass/";

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(uri + passAtual + "/" + username))
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

            boolean rsp = Boolean.parseBoolean(msg);
            if (rsp) {
                passValid = true;
            } else {
                passValid = false;
            }
        }
        return passValid;
    }
}
