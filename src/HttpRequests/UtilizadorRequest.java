package HttpRequests;

import MenuContents.Perfil;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Constant;
import models.Pecas;
import models.Tipo_Utilizador;
import models.Utilizador;
//import models.dtos.ResponseDto;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import models.AuthData;
//import org.apache.http.HttpHeaders;

public class UtilizadorRequest {

    public boolean validarPassAtual(String passAtual, String username) {

        String msg = null;
        boolean passValid = false;
        String uri = Constant.domain.DOMAIN + "/api/utilizador/validarPass/";

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(uri + passAtual + "/" + username))
                .header("accept", "application/json")
                .header(Constant.authorization.AUTH_TOKEN_NAME, AuthData.token)
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
    
    public Utilizador GetUser(String username) {

        String msg = null;
        Utilizador utilizador = null;
        String uri = Constant.domain.DOMAIN + "/api/utilizador/getutilizador/";

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(uri + username))
                .header("Accept", "application/json")
                .header(Constant.authorization.AUTH_TOKEN_NAME, AuthData.token)
                .build();

        HttpClient httpClient = HttpClient.newBuilder().build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            msg = response.body();
        } catch (IOException ex) {
            Logger.getLogger(Perfil.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Perfil.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (msg != null) {
            var gson = new Gson();

            try {
                utilizador = gson.fromJson(msg, models.Utilizador.class);
            } catch (IllegalStateException | JsonSyntaxException exception) {
                System.out.println(exception.getMessage());
            }

        }
        return utilizador;
    }

    public List<Tipo_Utilizador> getTipoUti(String username) {

        String msg = null;
        List<Tipo_Utilizador> tipo_uti = new ArrayList();
        String uri = Constant.domain.DOMAIN + "/api/utilizador/getTipoUti/";

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(uri + username))
                .header("accept", "application/json")
                .header(Constant.authorization.AUTH_TOKEN_NAME, AuthData.token)
                .build();

        HttpClient httpClient = HttpClient.newBuilder().build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            msg = response.body();
        } catch (IOException ex) {
            Logger.getLogger(Perfil.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Perfil.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (msg != null) {
            var gson = new Gson();
            Type tipoList = new TypeToken<ArrayList<Tipo_Utilizador>>() {
            }.getType();

            try {
                tipo_uti = gson.fromJson(msg, tipoList);

                if (tipo_uti.isEmpty()) {
                    tipo_uti = null;
                }
            } catch (IllegalStateException | JsonSyntaxException exception) {
                System.out.println(exception.getMessage());
            }
        }

        return tipo_uti;
    }

    /*public String loginUti(String username, String password) {

        org.apache.http.client.HttpClient client = org.apache.http.impl.client.HttpClientBuilder.create().build();

        String msg = null;
        int statusCode = 0;
        HashMap<String, Object> token = new HashMap();
        String auth = username + ":" + password;
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.ISO_8859_1));
        String authHeader = "Basic " + new String(encodedAuth);

        try {
            org.apache.http.client.methods.HttpPost request = new org.apache.http.client.methods.HttpPost(Constant.domain.DOMAIN + "/authorize");
            request.setHeader(org.apache.http.HttpHeaders.AUTHORIZATION, authHeader);
            org.apache.http.HttpResponse response = client.execute(request);
            msg = org.apache.http.util.EntityUtils.toString(response.getEntity());
            statusCode = response.getStatusLine().getStatusCode();
            
        } catch (IOException ex) {
            Logger.getLogger(Perfil.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (msg != null && statusCode == 200) {
            var gson = new Gson();

            try {
                token = gson.fromJson(msg, HashMap.class);
            } catch (IllegalStateException | JsonSyntaxException exception) {
                System.out.println(exception.getMessage());
            }

        }
        return token.get(Constant.authorization.AUTH_TOKEN_NAME).toString();
    }*/
}
