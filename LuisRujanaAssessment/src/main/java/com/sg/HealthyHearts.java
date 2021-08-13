package com.sg;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your age?");
        int userAge = Integer.parseInt(sc.nextLine());

        int maxHeartRate = 220 - userAge;
        double minHRZone = maxHeartRate * 0.5;
        double maxHrZone = maxHeartRate * 0.85;

        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + minHRZone + " - " + maxHrZone + " beats per minute");
    }
}
