package com.practice.list.chatting.client;

import java.io.*;
import java.net.*;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 3000);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        String message = reader.readLine();
        writer.println(message);

        socket.close();
    }
}