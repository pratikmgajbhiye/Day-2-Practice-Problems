package com.BridgeLabz.Day2PracticeProblem;
import java.util.Scanner;
public class Ifelse {
			
	public static void main(String[] args) {
		Scanner myobj =new Scanner(System.in);
		
		System.out.println("Digits to Words Conversion");

        System.out.println("Enter Digit:");
        int y =myobj.nextInt();
        if (y==0)
        {
            System.out.println("Zero");
        }
        else if(y==1)
        {
        	System.out.println("One");
        }
        else if (y==2)
        {
        System.out.println("Two");
        }
        else if (y==3)
        {
        System.out.println("Three");
        }
        else if (y==4)
        {
        System.out.println("Four");
        }
        else if (y==5)
        {
        System.out.println("Five");
        }
        else if (y==6)
        {
        System.out.println("Six");
        }
        else if (y==7)
        {
        System.out.println("Seven");
        }
        else if (y==8)
        {
        System.out.println("Eight");
        }
        else if (y==9)
        {
        System.out.println("Nine");
        }
        else if (y>9 && y<15)
        {
            System.out.println("Enter Only Single Digit Number");
        }
        else
        	System.out.println("Thanks");
	}

}
