package org.example;
import okhttp3.OkHttpClient;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static boolean poolErstellt = false;
    static String name;  //Name des eingeloggten Nutzers
    static int poolID;   // Pool-ID von Pool in dem Nutzer gerade ist
    static OkHttpClient client = new OkHttpClient();  //verwendeter Client
    static PostClass posten = new PostClass(); //Object, um die Anfragen an den Server zu schicken
    static String link = "http://82.165.238.192:5741/";  //Link, welcher Server benutzt werden soll
    //Permanenter Server: http://82.165.238.192:5741/
    
    //Testserver
    //http://tuhintest.ddns.net:5741/
    //http://localhost:4567/

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Herzlich Willkommen in einer Welt voller Spiel, Spass und Spannung! :D");
        Ablauf.start();

    }
}
