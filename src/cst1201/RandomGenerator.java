package cst1201;

import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {

    public static void main(String[] args) {

        int max = 0;
        int count;
        int min = 0;
        int sum = 0;
        double average = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a lower bound: ");
        int lower = keyboard.nextInt();

        System.out.println("Enter a upper bound: ");
        int upper = keyboard.nextInt();

        System.out.println("Enter the number of random integers to generate: ");
        count = keyboard.nextInt();

        Random random = new Random();
        System.out.println();

        for (int i = 0; i < count; i++) {
            int num = random.nextInt(upper - lower) + 1 + lower;

            max = num >= max ? num : max;
            min = num <= min || min == 0 ? num : min;
            sum += num;
            System.out.println(num);
            average = sum / count;

        System.out.println("The average is: " + average);
        System.out.println("The max is: " + max);
        System.out.println("The min is: " + min);
        System.out.println("The count is: " + count);
        System.out.println("Thesum is: " + sum);

        }
    }}
