/* You are making a program for a vending machine that provides drinks.*/
/* Take the choice of the customer as an integer from input and output the corresponding menu item.
Also, check for errors: in case the input is out of the range of the array, output "Invalid".*/

import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int choice = sc.nextInt();
        if (choice >= 0 && choice <= 4) {
            System.out.println(menu[choice]);
        } else {
            System.out.println("Invalid");
        }
    }

}