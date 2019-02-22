/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes_twt;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author lupaz
 */
public class Peticion { 
    
    public String httpGetSimple(String url) {
        String source = null;

        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);
            source = EntityUtils.toString(httpResponse.getEntity());
        } catch (IOException e) {
            //e.printStackTrace();
            return "error";
        }
        return source;
    }
    
}
