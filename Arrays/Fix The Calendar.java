/* 
The given calendar program should output the corresponding day of week from user input, but it has errors, can you fix them?*/

/* Task:
Fix the code so that the program prints the correct day.*/

import java.util.Scanner;
class Demo{
    public static void main(String[] args) {

        //fix the declaration of array
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday";

        //do not change this code
        Scanner scanner = new Scanner(System.in);
        int  number = scanner.nextInt();
        System.out.println(days[number]);
    }
}