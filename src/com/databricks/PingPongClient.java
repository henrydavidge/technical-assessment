package com.databricks;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.util.ssl.SslContextFactory;

public class PingPongClient {

    public static void main(String[] args) throws Exception {
        String trustStore = "./keystore.jks";
        SslContextFactory sslFactory = new SslContextFactory(trustStore);
        sslFactory.setKeyStorePassword("password");
        HttpClient client = new HttpClient(sslFactory);
        try {
            client.start();
            System.out.println(client.GET(args[0]).getContentAsString());
            System.exit(0);
        } catch (Exception e) {
            System.err.println("ERROR");
            e.printStackTrace(System.err);
            System.exit(1);
        }
    }
}
