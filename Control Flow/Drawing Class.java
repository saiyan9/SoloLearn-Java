/*You need to calculate how many pencils are in the classroom.
You're given code which takes as input the number of students and the number of pencils each of them has.*/

import java.util.Scanner;

class Demo {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int students = myObj.nextInt();
        int pencils = myObj.nextInt();
        System.out.println(students * pencils);
    }
}