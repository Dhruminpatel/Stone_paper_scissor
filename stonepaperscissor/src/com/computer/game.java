package com.computer;

import java.util.Scanner;
import java.util.Random;

public class game {

    Random random=new Random();
    Scanner sc=new Scanner(System.in);
    int total=0;
    void choice()
    {

        System.out.println("\n1. For Stone");
        System.out.println("2. For Paper");
        System.out.println("3. For Scissor");
        System.out.print("Enter your Choice ");
        byte choice=sc.nextByte();

        int Computerinput=random.nextInt(3);
        if(choice==Computerinput)
        {
            System.out.println("Draw!");
           // System.out.println("\nPlay again");
        }
        else if(choice==1 && Computerinput==3 ||choice==2 && Computerinput==1 ||
                choice==3 && Computerinput==2)
        {
            System.out.println("You Wins!");
         //   System.out.println("\tWell played");
             total=total+1;
        }
        else
        {
            System.out.println("Computer Wins!");
          //  System.out.println("\tBetter luck next time");
        }
      //  System.out.println("computer choice is "+choice);

        if(Computerinput==1)
        {
            System.out.println("Computer choice is Stone");
        }
        else if (Computerinput==2)
        {
            System.out.println("Computer choice is Paper");
        }
        else if (Computerinput==3)
        {
            System.out.println("Computer choice is Scissor");
        }
    }
    void Show() {
        System.out.println("\ntotal win is "+total +" out of 3");
    }

}
