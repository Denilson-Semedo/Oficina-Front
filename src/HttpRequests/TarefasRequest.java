package HttpRequests;

import MenuContents.Perfil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
import models.AuthData;
import models.Constant;
import models.Coordenador;
import models.Tarefas;

public class TarefasRequest {
    
    public List<Tarefas> getTarefasMecanicos(String id_mecanico) {

        String msg = null;
        List<Tarefas> tarefas = new ArrayList();
        String uri = Constant.domain.DOMAIN + "/api/tarefas/consultar_tarefas/";

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(uri + id_mecanico))
                .header("accept", "application/json")
                .header(Constant.authorization.AUTH_TOKEN_NAME, AuthData.token)
                .build();

        HttpClient httpClient = HttpClient.newBuilder().build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            int t = response.statusCode();
            if (t >= 200 && t <= 204) {
            msg = response.body();
            }
        } catch (IOException ex) {
            Logger.getLogger(Perfil.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Perfil.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (msg != null && !msg.equals("[]")) {
            var gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
            Type tarefasList = new TypeToken<ArrayList<Tarefas>>() {}.getType();
            tarefas = gson.fromJson(msg, tarefasList);

            if (tarefas.isEmpty()) {
                tarefas = null;
            }
        }
        
        return tarefas;
    }
    
    public Tarefas registarTarefa(Tarefas t) {
        
        String msg = null;
        Tarefas tarefas = new Tarefas();
        String uri = Constant.domain.DOMAIN + "/api/tarefas/registar_tarefas";
        Gson gson = new Gson();
        String requestBody = gson.toJson(t);
        
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .uri(URI.create(uri))
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header(Constant.authorization.AUTH_TOKEN_NAME, AuthData.token)
                .build();

        HttpClient httpClient = HttpClient.newBuilder().build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            response.statusCode();
            msg = response.body();
        } catch (IOException ex) {
            Logger.getLogger(Perfil.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Perfil.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (msg != null && !msg.equals("[]")) {
//            var gson = new Gson();
//            Type tarefasList = new TypeToken<ArrayList<Tarefas>>() {}.getType();
            tarefas = gson.fromJson(msg, Tarefas.class);

            if (tarefas.getNome() == null ) {
                tarefas = null;
            }
        }
        
        return tarefas;
    }
    
    public Tarefas getTarefaById(int id) {

        String msg = null;
        Tarefas tarefas = new Tarefas();
        String uri = Constant.domain.DOMAIN + "/api/tarefas/get_tarefa/";

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(uri + id))
                .header("accept", "application/json")
                .header(Constant.authorization.AUTH_TOKEN_NAME, AuthData.token)
                .build();

        HttpClient httpClient = HttpClient.newBuilder().build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            int t = response.statusCode();
            if (t >= 200 && t <= 204) {
            msg = response.body();
            }
        } catch (IOException ex) {
            Logger.getLogger(Perfil.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Perfil.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (msg != null && !msg.equals("[]")) {
            var gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
            tarefas = gson.fromJson(msg, Tarefas.class);
        }
        
        return tarefas;
    }
    
    public boolean alterarEstadoTarefa(int tarefaId) {
        
        boolean done = false;
        String uri = Constant.domain.DOMAIN + "/api/tarefas/alterar_estado_tarefas/";
        
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(""))
                .uri(URI.create(uri + tarefaId))
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header(Constant.authorization.AUTH_TOKEN_NAME, AuthData.token)
                .build();

        HttpClient httpClient = HttpClient.newBuilder().build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                done = true;
            }
        } catch (IOException ex) {
            Logger.getLogger(Perfil.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Perfil.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        
        return done;
    }
}
