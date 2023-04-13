//You are making a program for a chess tournament, that needs to calculate the points earned by a player.//
//A win is worth 1 point, while a tie is worth 0.5 points.//
//The given program declares two variables: wins and ties with the corresponding values.//
//Create a program to calculate and output the points earned by the player.//

public class Program{
    public static void main(String[] args){
        int wins = 54;
        int ties = 31;

        double TotalWins = wins * 1;
        double TotalTies = ties * 0.5;

        double Total = TotalWins + TotalTies;

        System.out.println(Total);
    }
}