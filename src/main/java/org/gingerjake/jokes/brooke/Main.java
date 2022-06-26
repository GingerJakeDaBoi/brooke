package org.gingerjake.jokes.brooke;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public Main() {
    }

    public static <insults> void main(String[] args) throws UnknownHostException {

        //test that the app works
        System.out.println("Hello World!");

        //print host IP address (totally real)
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("Your IP address is... " + ip.getHostAddress());

        //make a new list for insults
        List<insults> stList = new ArrayList();

        //All the insults (more later)
        stList.add((insults) "You're a piece of shit");
        stList.add((insults) "Ugggggggggggh...");
        stList.add((insults) "I bet you wasted your diamonds on a hoe!");
        stList.add((insults) "Nobody likes you, in fact there are a lot of people that hate you.");
        stList.add((insults) "Your breath stinks!");
        stList.add((insults) "You'd probably let me peg you...");
        stList.add((insults) "You probably wet your bed every night.");
        stList.add((insults) "I don't know if you're an idiot or just stupid.");

        //Print a random insult from the list
        Random rand = new Random();
        int randomIndex = rand.nextInt(stList.size());
        System.out.println(stList.get(randomIndex));
    }
}
