/*You and two of your friends have decided to require a password when logging into the system you created. Each of you has decided your own 4-digit password and included it. In the given code, you have declared an array “passwords” and taken the inputted password from the user who wants to enter the system.
Task:
Complete the code to check whether the inputted password is one of the ones you decided, and output to the screen “Welcome” if it is. */

import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        
        int[] passwords = {2021, 1023, 9929};
        Scanner scanner = new Scanner(System.in);

        int  password = scanner.nextInt();
        /*iterate through the array “passwords” and */
        for (int x=0; x<passwords.length; x++) {
            if (passwords[x]== password) {
                System.out.println("Welcome");

            }

        }
    }
