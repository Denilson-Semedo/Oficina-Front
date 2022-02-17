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
import models.Efetivo;
import models.Mecanico;

public class MecanicoRequest {
    
    public void setEfetivo(Efetivo efetivo){
        String msg = null;
        Gson gson = new Gson();
        String requestBody = gson.toJson(efetivo);
        String uri = Constant.domain.DOMAIN + "/api/efetivo/registar_efetivo";
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .uri(URI.create(uri))
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException ex) {
            Logger.getLogger(MecanicoRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(MecanicoRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Efetivo getInfoEfetivo(String username) {

        String msg = null;
        Efetivo efetivo = null;
        String uri = Constant.domain.DOMAIN + "/api/efetivo/get_efetivo_by_username/";

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
            efetivo = gson.fromJson(msg, models.Efetivo.class);
        }
        return efetivo;
    }

    public void atualizarPerfilMecanicoEfetivo(Efetivo efetivo, boolean passwordChange) throws IOException, InterruptedException {

        Gson gson = new Gson();
        String requestBody = gson.toJson(efetivo);
        String uri = Constant.domain.DOMAIN + "/api/efetivo/atualizar_efetivo/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .uri(URI.create(uri + passwordChange))
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("chegou em atualiazr efetivo " + response.body());
    }
    
    public List<Mecanico> getMecanico() {

        String msg = null;
        List<Mecanico> mecanico = new ArrayList<>();
        String uri = Constant.domain.DOMAIN + "/api/mecanico/listar_mecanico/3";

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(uri))
                .header("accept", "application/json")
                .build();

        HttpClient httpClient = HttpClient.newBuilder().build();

       
            HttpResponse<String> response;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            msg = response.body();
        } catch (IOException ex) {
            Logger.getLogger(MecanicoRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(MecanicoRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        

        if (msg != null) {
            var gson = new Gson();
            Type mecanicoList = new TypeToken<ArrayList<Mecanico>>() {}.getType();
            mecanico = gson.fromJson(msg, mecanicoList);

            if (mecanico.isEmpty()) {
                mecanico = null;
            }
        }
        return mecanico;
    }
}
