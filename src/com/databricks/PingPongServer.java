package com.databricks;

import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.SslConnectionFactory;
import org.eclipse.jetty.util.ssl.SslContextFactory;

public class PingPongServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server();
        SslContextFactory sslContextFactory = new SslContextFactory("./keystore.jks");
        sslContextFactory.setKeyStorePassword("password");
        ServerConnector serverConnector = new ServerConnector(server, sslContextFactory);
        serverConnector.setPort(8080);
        server.addConnector(serverConnector);
        server.setHandler(new PingPongHandler());
        server.start();
        server.join();
    }
}
