package Convert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose, what are yo would like to convert?  1- weight, 2- distance");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Choose unit. 1-Kilograms.2 -Pounds");
            int c = scanner.nextInt();
            System.out.println("Enter value");
            int value = scanner.nextInt();
            switch (c) {
                case 1:
                    double kg = 1;
                    double lb = 2.2046 * kg;
                    System.out.println("Result");
                    System.out.println("Pounds: " + value * lb);
                    System.out.println("Kilograms: " + value * kg);
                    break;
                case 2:
                    double kg1 =0.453592 ;
                    double lb1 =1/kg1 ;
                    System.out.println("Result");
                    System.out.println("Kilograms: "+ value/lb1);
                    System.out.println("Pounds: " + value);
                    break;
            }
        }
        if (a==2) {
            System.out.println("Choose unit. 1-Kilometer.2 -Miles");
            int c = scanner.nextInt();
            System.out.println("Enter value");
            int value = scanner.nextInt();
            switch (c) {
                case 1:
                    double miles =0.62137100000000000666 ;
                    double meter = 1*miles;
                    System.out.println("Result");
                    System.out.println("Miles: " + value * meter);
                    System.out.println("Kilometer: " + value);
                    break;
                case 2:
                    double meter1 =1.60934 ;
                    double miles1 = 1/meter1;
                    System.out.println("Result");
                    System.out.println("Miles:" + value);
                    System.out.println("Kilometer: " + value/miles1);
                    break;
            }
        }

        }
    }
