package com.example;

import java.util.ArrayList;
import java.util.Random;

public class Joker {

    private Random random = new Random();
    private ArrayList<String> jokes = jokesList();

    public String getJoke(){
        return jokes.get(random.nextInt(jokes.size()));
    }

    private ArrayList<String> jokesList(){
        ArrayList<String> jokes = new ArrayList<>();

        jokes.add("If it weren’t for C, we’d all be programming in BASI and OBOL.");
        jokes.add("There are 10 types of people in the world: those who understand binary, and those who don’t.");
        jokes.add("Programming today is a race between software engineers striving to build bigger and better idiot-proof programs, and the Universe trying to produce bigger and better idiots. So far, the Universe is winning.");
        jokes.add("In a world without fences and walls, who needs Gates and Windows?");
        jokes.add("Never underestimate the bandwidth of a station wagon full of tapes hurling down the highway.");
        jokes.add("I’m not interrupting you, I’m putting our conversation in full-duplex mode.");
        jokes.add("Lotteries are a tax on people who suck at math.");
        jokes.add("A computer lets you make more mistakes faster than any invention in human history – with the possible exceptions of handguns and tequila.");
        jokes.add("Computers make very fast, very accurate mistakes.");
        jokes.add("To err is human – and to blame it on a computer is even more so.");
        jokes.add("The box said ‘Requires Windows Vista or better’. So I installed LINUX.");
        jokes.add("Bugs come in through open Windows.");

        return jokes;
    }
}
