package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// variables
        int number = 0;
        Scanner scanner = new Scanner(System.in);

    // enter a number
        do {
            System.out.printf("Please enter a number from 1 to 10: ");
            number = scanner.nextInt();
            if(number < 1 || number > 10)
            {
                System.out.println("That wasn't a valid number. Try again.");
            }
        }while(number < 1 || number > 10);

    // switch
        switch (number)
        {
            case 1:
                System.out.println("The number 1 is еден in Macedonian.");
                break;
            case 2:
                System.out.println("The number 2 is два in Macedonian.");
                break;
            case 3:
                System.out.println("The number 3 is три in Macedonian.");
                break;
            case 4:
                System.out.println("The number 4 is четири in Macedonian.");
                break;
            case 5:
                System.out.println("The number 5 is пет in Macedonian.");
                break;
            case 6:
                System.out.println("The number 6 is шест in Macedonian.");
                break;
            case 7:
                System.out.println("The number 7 is седум in Macedonian.");
                break;
            case 8:
                System.out.println("The number 8 is осум in Macedonian.");
                break;
            case 9:
                System.out.println("The number 9 is девет in Macedonian.");
                break;
            case 10:
                System.out.println("The number 10 is десет in Macedonian.");
                break;
        }
    }
}
