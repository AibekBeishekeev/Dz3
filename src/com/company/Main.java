package com.company;

public class Main {

    public static void main(String[] args) {
        double[] massiv = {10, 6, 3, 1, -5, 3, 6, -36, 12, -23, 293, -9, -3, 9};
        double sum = 0;
        int counter = 0;
        double finalSum;

        for (double s : massiv) {
            if (s > 0) {
                counter++;
                sum += s;
                System.out.println(s);
            } else {
                finalSum = sum / counter;
                System.out.println("Final sum is : " + finalSum);
                break;
            }
        }
    }
}
