package by.sheka.app.javaFX.server;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static Logger logger = Logger.getLogger(Server.class);


    public static void main(String[] args) {
        String log4jConfPath = "properties/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        try {
            //TODO альтернативный порт
            ServerSocket serverSocket = new ServerSocket(8080);
            while(true){
                Socket socket = serverSocket.accept();
                if(socket.isConnected()){
                    logger.info("Клиент установил соединение c сервером, адресс - " + socket.getInetAddress() +'.');
                    new Handler(socket);
                }
            }
        } catch (IOException e) {
            logger.error("Клиенту не удалось установить соединение с сервером.", e);
        }

    }




}
