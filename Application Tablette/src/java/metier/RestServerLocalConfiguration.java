/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import lml.rest.client.RestServerConfig;

/**
 *
 * @author flori
 */
public class RestServerLocalConfiguration extends RestServerConfig {

    private static String url = "http://localhost:9999";//Adresse ip serveur 172.16.79

    static {
        FileInputStream input = null;
        try {
            Properties properties = new Properties();
            input = new FileInputStream("server.properties");
            properties.load(input);
            input.close();
            url = properties.getProperty("Server.url");
        } catch (IOException e) {
            System.err.println(e.getMessage() + "\nusing default url : " + url);
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException exception) {
                System.err.println(exception.getMessage());
            }
        }
    }

    public RestServerLocalConfiguration() {
        super(url, "Projet Audit", "rest");
    }
}
