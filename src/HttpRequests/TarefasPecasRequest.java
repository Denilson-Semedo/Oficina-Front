/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import models.AuthData;
import models.Constant;
import models.Tarefas;

/**
 *
 * @author kelve
 */
public class TarefasPecasRequest {
    
    public boolean registarTarefa(int idTarefa, int idPeca, int quantidade) {
        
        boolean done = false;
        String uri = Constant.domain.DOMAIN + "/api/tarefas_pecas/adicionar_pecas_em_tarefas/";
        
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(""))
                .uri(URI.create(uri + idTarefa + "/" + idPeca + "/" + quantidade))
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header(Constant.authorization.AUTH_TOKEN_NAME, AuthData.token)
                .build();

        HttpClient httpClient = HttpClient.newBuilder().build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            int i = response.statusCode();
            if (response.statusCode() == 201) {
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
