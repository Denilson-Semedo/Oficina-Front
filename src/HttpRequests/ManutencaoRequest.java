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
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import models.Entrada;
import models.Manutencao;
import models.Saida;

public class ManutencaoRequest {
    
    public void setSaida(Saida saida){
        String msg = null;
        Gson gson = new Gson();
        String requestBody = gson.toJson(saida);
        String uri = Constant.domain.DOMAIN + "/api/saida/registar_saida";
        
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
            Logger.getLogger(ManutencaoRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ManutencaoRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setEntrada(Entrada entrada){
        String msg = null;
        Gson gson = new Gson();
        String requestBody = gson.toJson(entrada);
        String uri = Constant.domain.DOMAIN + "/api/entrada/registar_entrada";
        
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
            Logger.getLogger(ManutencaoRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ManutencaoRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Entrada> getEntrada() {

        String msg = null;
        List<Entrada> entrada = new ArrayList<>();
        String uri = Constant.domain.DOMAIN + "/api/entrada/listar_todas_entradas";

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
            //Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
           // Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (msg != null) {
            var gson = new Gson();
            Type entradaList = new TypeToken<ArrayList<Entrada>>() {}.getType();
            entrada = gson.fromJson(msg, entradaList);

            if (entrada.isEmpty()) {
                entrada = null;
            }
        }
        return entrada;
    }
    
    public List<Saida> getSaida() {

        String msg = null;
        List<Saida> saida = new ArrayList<>();
        String uri = Constant.domain.DOMAIN + "/api/saida/listar_todas_saida";

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
            //Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
           // Logger.getLogger(Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (msg != null) {
            var gson = new Gson();
            Type entradaList = new TypeToken<ArrayList<Saida>>() {}.getType();
            saida = gson.fromJson(msg, entradaList);

            if (saida.isEmpty()) {
                saida = null;
            }
        }
        return saida;
    }
}
