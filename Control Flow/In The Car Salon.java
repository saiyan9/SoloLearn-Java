/* You have $12000 to buy a car.
You're given a program which takes the price of a car as an input.
Task:
Add code part to output "enough" if the price is lower than or equal to 12000. Otherwise, don't output anything.*/

import java.util.Scanner;

public class Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = scanner.nextInt();

        if (price <= 12000) {
            System.out.println("enough"); 
        }
    }
}