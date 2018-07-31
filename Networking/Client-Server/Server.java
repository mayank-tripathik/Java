package com.example;
import javax.xml.crypto.Data;
import java.net.*;
import java.io.*;
import java.util.Random;
public class Server{

    //define varibales for sockets
    private ServerSocket server;
    private Socket socket;
    private PrintWriter writer;
    private String[] advices = {"Drink enough water","Don't text and drive","Keep calm and trust nobody"};

    //cpnstructor that takes port number

    public Server(int port){
        try {
            server = new ServerSocket(port);
            socket = server.accept();
            Random r = new Random();
            String advice = advices[r.nextInt(3)];
            writer = new PrintWriter(socket.getOutputStream());
            writer.println(advice);
            writer.close();
            server.close();
            System.out.println(advice);
        }
        catch(Exception e){
            System.out.println("Some error occurred in server side");
        }
    }

    public static void main(String[] args){
        Server myserver = new Server(5004);

    }
}
