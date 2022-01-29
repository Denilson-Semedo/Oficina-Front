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
import javax.swing.JOptionPane;
import models.Constant;
import models.Fatura;

public class FaturaRequest {

    public List<Fatura> getFatura() {

        String msg = null;
        List<Fatura> fatura = new ArrayList<>();
        String uri = Constant.domain.DOMAIN + "/api/fatura/lista_faturas";

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
            JOptionPane.showMessageDialog(null, "Erro de Conexão1!!");
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Erro de Conexão2!!");
        }

        if (msg != null) {
            var gson = new Gson();
            Type faturaList = new TypeToken<ArrayList<Fatura>>() {}.getType();
            fatura = gson.fromJson(msg, faturaList);

            if (fatura.isEmpty()) {
                fatura = null;
            }
        }
        return fatura;
    }
}
