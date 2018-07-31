package com.example.helloworld;
import java.net.Socket;
import java.io.*;

public class Client{

    // variables for client

    // Socket instance to make client connect to the address and the port
    private Socket client;

    // Buffered reader for taking input from terminal
    private BufferedReader input;


    // Constructor that takes the address and port initialized the client
    public Client(String address, int port){

        // Creating a socket at client side
        try {
            client = new Socket(address, port);
            input = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String advice = input.readLine();
            System.out.println(advice);
            input.close();
            client.close();
        }
        catch (IOException e){
            System.out.println(("some error occured "  + e));
        }


    }
    public static void main(String args[]){
        Client myclient = new Client("127.0.0.1",5004);

    }
}

