/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author radmi
 */
public class RockPaperScissorsGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] computerHandArray = {"R", "P", "S"};
        String computerHand = "", thisWinner = "", theFinalWinner = "";
        int index = 0;
        int timesIWon = 0;
        int timesComputerWon = 0;
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {
          System.out.print("Please enter the "+ (i+1)+ " value  >> ");
          String myHandString = in.nextLine();
          String myHand = myHandString.substring(0, 1);
          myHand = myHand.toUpperCase();
          System.out.println(myHand);
          index = ((int) (Math.random() * 10) % 3);
          computerHand = computerHandArray[index];
          System.out.println(computerHand);
          thisWinner = theWinnerOfOneGame(myHand, computerHand);
          if(thisWinner.equals("ME"))
          {
            timesIWon++;
            System.out.println("I won this trial, my score is : " + timesIWon);
          }
          else if(thisWinner.equals("COMPUTER"))
          {
            timesComputerWon++;
            System.out.println("Computer won this trial, computer score is : " + timesComputerWon);
          }
          else
            System.out.println("It is a tie");

        }
        if(timesIWon == timesComputerWon)
           theFinalWinner = "TIE";
        else if(timesIWon > timesComputerWon)
          theFinalWinner = "ME";
        else if(timesComputerWon > timesIWon)
          theFinalWinner = "COMPUTER";

        System.out.println("I won " + timesIWon + " game(s)");
        System.out.println("Computer won " + timesComputerWon + " games");
        System.out.println("The Final Winner after the 5 games is: " + theFinalWinner);
    }
    private static String theWinnerOfOneGame(String myHand, String computerHand)
    {
      String theWinner = "TIE";
      if(myHand.equals(computerHand))
          theWinner = "TIE";
          else if(myHand.equals("R"))
          {
            if(computerHand.equals("P"))
              {
                theWinner = "COMPUTER";
              }
            else if(computerHand.equals("S"))
            {
              theWinner = "Me";
            }
          }
          else if(myHand.equals("P"))
          {
            if(computerHand.equals("R"))
            {
              theWinner = "ME";
            }
            else if(computerHand.equals("S"))
            {
              theWinner = "COMPUTER";
            }
          }
          else if(myHand.equals("S"))
          {
            if(computerHand.equals("R"))
            {
              theWinner = "COMPUTER";
            }
            else if(computerHand.equals("P"))
            {
              theWinner = "ME";
            }
          }
      return theWinner;
    }
}
