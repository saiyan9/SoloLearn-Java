/* You are making an automated response program for a store.
The bot should take a number from the user as input and reply with an automated message.
There are currently 3 responses, that you need to a handle:
User message: "1", Reply: "Order confirmed"
User message: "2", Reply: "info@sololearn.com"
For any other number, the reply should be: "Try again".
The given code calls a method called bot(). Define the method, which should take an integer input from the user, and handle the above mentioned cases, by outputting the corresponding reply.
Do not change the method call in main().*/

import java.util.Scanner;

public class Program {
    //your code goes here
    /*
    User message: "1", Reply: "Order confirmed"
    User message: "2", Reply: "info@sololearn.com"
    For any other number, the reply should be: "Try again". 
    */
    public static void main(String[] args) {
        bot();
    }
    public static void bot() {
        Scanner sc = Scanner(System.in);
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Order confirmed");
                break;
            case 2: 
                System.out.println("info@sololearn.com");
                break;
            default:
                System.out.println("Try again");
        }
    }
}

