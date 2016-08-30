# Ping pong server

This repository contains a simple HTTPS ping-pong client and server. The client and server can both be run from the uber-jar
provided to you on both machines at /home/ec2-user/ping-pong.jar.

Both the client and server will look for a Java keystore file at `$(pwd)/keystore.jks`.

When the client runs successfully, it will print out "pong" and exit with code 0.

To run the server: `java -cp $PATH_TO_JAR com.databricks.PingPongServer`

To run the client: `java -cp $PATH_TO_JAR com.databricks.PingPongClient https://$SERVER_HOST:8080`
