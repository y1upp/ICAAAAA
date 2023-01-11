/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a0057107;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class SubForSpecificMonth {
    
    void printMonthSummary ()throws FileNotFoundException{
        System.out.println("Enter 1 for January, 2 for February, 3 for March, 4 for April, 5 for May, 6 for June, 7 for July, 8 for August, 9 for September, 10 for October, 11 for November or 12 for December");
        
        Scanner Scanner = new Scanner(System.in);
        int Month;
        Month = Scanner.nextInt();
        
        int MSubCounter = 0;
        
        int JanSubs = 0; // counter
        int FebSubs = 0; // counter
        int MarSubs = 0; // counter
        int AprSubs = 0; // counter
        int MaySubs = 0; // counter
        int JunSubs = 0; // counter
        int JulSubs = 0; // counter
        int AugSubs = 0; // counter
        int SepSubs = 0; // counter
        int OctSubs = 0; // counter
        int NovSubs = 0; // counter
        int DecSubs = 0; // counter
        int MonthlyCost = 0;
        
        File current = new File("current.txt");
        Scanner ScanFile = new Scanner(current);
        
        
        while (ScanFile.hasNextLine()) {
            String line = ScanFile.nextLine();
            String month = line.substring(3, 6);
            String Package = ScanFile.next();
            ScanFile.next();
            ScanFile.next();
            String Monthly = ScanFile.next();
            //Int Cost = ScanFile.nextInt();
            
            if (Month == 1){
                if (month.equals("Jan")){
                    JanSubs++;}
                if (Monthly.equals("M")){
                    MSubCounter++;}
                MonthlyCost = MonthlyCost + ScanFile.nextInt();
                float truetotal = MonthlyCost/MSubCounter;
            System.out.println("Total number of subscriptions for January: "+JanSubs);
            System.out.println("Average subscription fee: "+ truetotal);
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: ");
            System.out.println("Silver:");
            System.out.println("Silver: ");
            System.out.println("");
          
        }
        else if (Month == 2){
            if (month.equals("Feb")){
                    FebSubs++;}
            
            System.out.println("Total number of subscriptions for February: "+FebSubs);
            System.out.println("Average subscription fee: ");
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: ");
            System.out.println("Silver:");
            System.out.println("Silver: ");
            System.out.println("");
            
        }
        else if (Month == 3){
            if (month.equals("Mar")){
                    MarSubs++;}
            System.out.println("Total number of subscriptions for March: " +MarSubs);
            System.out.println("Average subscription fee: ");
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: ");
            System.out.println("Silver:");
            System.out.println("Silver: ");
            System.out.println("");
            
        }
        else if (Month == 4){
            if (month.equals("Apr")){
                    AprSubs++;}
            System.out.println("Total number of subscriptions for April: "+AprSubs);
            System.out.println("Average subscription fee: ");
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: ");
            System.out.println("Silver:");
            System.out.println("Silver: ");
            System.out.println("");
            
        }
        else if (Month == 5){
            if (month.equals("May")){
                    MaySubs++;}
            System.out.println("Total number of subscriptions for May: "+MaySubs);
            System.out.println("Average subscription fee: ");
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: ");
            System.out.println("Silver:");
            System.out.println("Silver: ");
            System.out.println("");
            
        }
        else if (Month == 6){
            if (month.equals("Jun")){
                    JunSubs++;}
            System.out.println("Total number of subscriptions for June: "+JunSubs);
            System.out.println("Average subscription fee: ");
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: ");
            System.out.println("Silver:");
            System.out.println("Silver: ");
            System.out.println("");
           
        }
        else if (Month == 7){
            if (month.equals("Jul")){
                    JulSubs++;}
            System.out.println("Total number of subscriptions for July: "+JulSubs);
            System.out.println("Average subscription fee: ");
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: ");
            System.out.println("Silver:");
            System.out.println("Silver: ");
            System.out.println("");
            
        }
        else if (Month == 8){
            if (month.equals("Aug")){
                    AugSubs++;}
            System.out.println("Total number of subscriptions for August: "+AugSubs);
            System.out.println("Average subscription fee: ");
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: ");
            System.out.println("Silver:");
            System.out.println("Silver: ");
            System.out.println("");
            
        }
        else if (Month == 9){
            if (month.equals("Sep")){
                    SepSubs++;}
            System.out.println("Total number of subscriptions for September: "+SepSubs);
            System.out.println("Average subscription fee: ");
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: ");
            System.out.println("Silver:");
            System.out.println("Silver: ");
            System.out.println("");
            
        }
        else if (Month == 10){
            if (month.equals("Oct")){
                    OctSubs++;}
            System.out.println("Total number of subscriptions for October: "+OctSubs);
            System.out.println("Average subscription fee: ");
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: ");
            System.out.println("Silver:");
            System.out.println("Silver: ");
            System.out.println("");
            
        }
        else if (Month == 11){
            if (month.equals("Nov")){
                    NovSubs++;}
            System.out.println("Total number of subscriptions for November: "+NovSubs);
            System.out.println("Average subscription fee: ");
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: ");
            System.out.println("Silver:");
            System.out.println("Silver: ");
            System.out.println("");
            
        }
        else if (Month == 12){
            if (month.equals("Dec")){
                    DecSubs++;}
            System.out.println("Total number of subscriptions for December: "+DecSubs);
            System.out.println("Average subscription fee: ");
            System.out.println("");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: ");
            System.out.println("Silver:");
            System.out.println("Silver: ");
            System.out.println("");
            
        }
        ScanFile.nextLine();
        }
       
    }
}
