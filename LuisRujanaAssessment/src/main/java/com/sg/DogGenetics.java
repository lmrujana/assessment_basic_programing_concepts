package com.sg;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your dog's name?");
        String dogName = sc.nextLine();

        System.out.println("Well then, I have this highly reliable report on " +
                dogName +
                " prestigious background right here.");

        String[] dogBreeds = {"St. Bernard", "Chihuahua", "Dramatic RedNose Asian Pug",
                "Common Cur", "King Doberman"};

        int total = 100;

        for(int i = 0; i < 3; i++){
            int currentPercent = rnd.nextInt(total + 1);
            total = total - currentPercent;
            System.out.println(currentPercent + "% " + dogBreeds[i]);
        }

        System.out.println(total + "% " + dogBreeds[3]);
    }
}
