/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ica;

import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;



public class Display {
    
      

     void display() {
        
        System.out.println("Enter your name:" + "\n" + "Enter your desired Package:" + "\n" + "Enter the duration you want your sub to be:" + "\n" + "Enter your discount code:" + "Enter your payment terms(monthly or one-off");
         
         
        
        
        Scanner Scanner = new Scanner (System.in); // defing the name of our scanner
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now(); // getting the date
        Name Name = new Name();
        SUBs SUBs= new SUBs();
        double SubscriptionCost = 0;
        double SubCodeDis;
        
//*************************************** ENTER NAME CODE
        System.out.println("please enter your name"); // asks user to enter their name  
        String YourNameIn = Name.YourName();
        System.out.println("you entered " + YourNameIn);

        
//*************************************** ENTER PACKAGE CODE        
        char UserPackage = 0;
        while (true) 
    {
            System.out.println("Enter Package B,S or G: ");
            UserPackage = Scanner.nextLine().charAt(0);
            if (UserPackage != 'B' && UserPackage != 'S' && UserPackage != 'G')
            { 
                System.out.println("Invalid Input, please pick from the 3 options available");
            }
            else
            {
                break;
            }
    }
      System.out.println("you  entered the " + (UserPackage) + " Subscription");
    
      
//*************************************** ENTER DURATION CODE  
      int DurIN;
    while (true) {
    try {
        System.out.println("Enter duration 1,3, 6 or 12 ");
        DurIN = Scanner.nextInt();
        if (DurIN != 1 && DurIN != 3 && DurIN != 6 && DurIN != 12)
            { 
                System.out.println("Invalid Input, please pick from the 4 options available.");
            }
            else
            {
                break;
            }
    }
    catch (InputMismatchException i) {
        System.out.println("invalid input. please enter, 1,3,6 or 12 ");
        Scanner.nextLine();
    }
    }
    System.out.println("Your duration will be " + (DurIN) + " months");

    
//*************************************** ENTER DISCOUNTCODE CODE   
    String DiscountC = Scanner.nextLine();
    
    try {
        System.out.println("Enter your discount code");
        DiscountC = Scanner.nextLine();
                
    }
    catch (InputMismatchException i) {
        System.out.println("invalid input. please enter, 1,3,6 or 12");
        Scanner.nextLine();
    }
System.out.println("Your discount code is " + (DiscountC));
System.out.println("Your discount code percentage is: " + DiscountC.charAt(DiscountC.length() - 1)+ "%");

//***************************************  ENTER TERMS CODE
    
System.out.println("Enter Terms (press 1 for pay in full or press 2 for monthly subscription): ");

    int TermIN;
    while (true) {
    try {
        TermIN = Scanner.nextInt();
        if (TermIN == 1)
            { 
                System.out.println("You want to pay your subscription in full for addition discount");
            break;
            }
         else if (TermIN == 2)
            {
                System.out.println("You are going to pay your subscription monthly");
            break;
            }
        else if (TermIN != 1 && TermIN != 2)
        {
            System.out.println("please enter either 1 to pay full price or press 2 to pay monthly");
        }
        else break;
    }
    catch (InputMismatchException i) {
        System.out.println("Invalid Input, please press 1 for pay in full or press 2 for monthly subsciption");
        //Scanner.nextLine();
    }
    }
    System.out.println("you entered the payment term of " + TermIN);
    Scanner.nextLine();


        
//***************************************  
    
    if (DurIN == 1 && UserPackage == 'B')
    
    {
        SubscriptionCost = 6.00;
    }
    else if (DurIN == 3 && UserPackage == 'B')
    {
        SubscriptionCost = 5.00;
    }
    else if (DurIN == 6 && UserPackage == 'B')
    {
        SubscriptionCost = 4.00;
    }
    else if (DurIN == 12 && UserPackage == 'B')
    {
        SubscriptionCost = 3.00;
    }
 
//***************************************  
    
    else if (DurIN == 1 && UserPackage == 'S')
    {
        SubscriptionCost = 8.00;
    }
    else if (DurIN == 3 && UserPackage == 'S')
    {
        SubscriptionCost = 7.00;
    }
    else if (DurIN == 6 && UserPackage == 'S')
    {
        SubscriptionCost = 6.00;
    }
    else if (DurIN == 12 && UserPackage == 'S')
    {
        SubscriptionCost = 5.00;
    }

//***************************************  
    
    else if (DurIN == 1 && UserPackage == 'G')
    {
        SubscriptionCost = 9.99;
    }
    else if (DurIN == 3 && UserPackage == 'G')
    {
        SubscriptionCost = 8.99;
    }
    else if (DurIN == 6 && UserPackage == 'G')
    {
        SubscriptionCost = 7.99;
    }
    else if (DurIN == 12 && UserPackage == 'G')
    {
        SubscriptionCost = 6.99;
    }

    double SubscriptionDiscountDivided;

    double SubscriptionDiscountTimes;

    double SubscriptionDiscountCode;

    double TrueDiscount;
    
    
    
    SubCodeDis = (SubscriptionCost * (DiscountC.charAt(DiscountC.length() - 1) / 100));
    TrueDiscount = SubscriptionCost - SubCodeDis;
    
    
//SubscriptionDiscountDivided = DiscountC.charAt(DiscountC.length() - 1) / 100; // for instantce -- 4.    4 / 100 = 0.04
//SubscriptionDiscountTimes = SubscriptionDiscountDivided * SubscriptionCost; // 0.04 * 5 = 0.2
//TrueDiscount = SubscriptionCost - SubscriptionDiscountTimes; // 5 - 0.2 = 4.8


        
        System.out.println("+===============================================+"); 
        System.out.println("|" + "\t\t\t\t\t\t" + "|");
        System.out.println("|" + " Customer: "  + YourNameIn +"\t\t\t " + "       "+ "|"); 
        System.out.println("|" + "\t\t\t\t\t\t" + "|");
        System.out.print("|" + "     " + "Date:" + (dtf.format(now)));
        System.out.println("\t" + "Discount Code: " + DiscountC + "\t" + "|");
        System.out.print("|" + "  Package: " + UserPackage); 
        System.out.println("\t" + "            " + "Duration: " + DurIN + "\t\t" + "|");
        System.out.println("|" + "    Terms: " + TermIN + "\t\t\t\t\t" + "|");
        System.out.println("|" + "\t\t\t\t\t\t" + "|");
        System.out.println("|" + "            " + "Subcost " + TrueDiscount + " \t\t" + "|");
        System.out.println("|" + "\t\t\t\t\t\t" + "|");
        System.out.println("+===============================================+");
     
        try {
            FileWriter writer = new FileWriter("subscription.txt");
            writer.write("Date: " + (dtf.format(now)) + "   " + "Duration: " + DurIN + "   " + "Package: " + UserPackage + "   " + "Name: " + YourNameIn + "   " + "Discount Code: " + DiscountC + "   " + "Payment Term: " + TermIN  + "   " );
            writer.close();

}       
     catch (IOException e) {
    e.printStackTrace();
}
     
     }
    
       
     
}
    