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
        int JanMonthlyCost = 0;
        float Bronze =0 ;
        float Silver = 0;
        float Gold = 0;
        
        File current = new File("current.txt");
        Scanner ScanFile = new Scanner(current);
        
        while (ScanFile.hasNextLine()) {
            String line = ScanFile.next();
            String month = line.substring(3, 6);
            String Package = ScanFile.next();
            ScanFile.next();
            ScanFile.next();
            String Monthly = ScanFile.next();
            //Int Cost = ScanFile.nextInt();
            
            
            if (month.equals("Jan")){
                    JanSubs++;}
            
            else if (month.equals("Feb")){
                    FebSubs++;}
                
                else  if (month.equals("Mar")){
                    MarSubs++;}
                
                else  if (month.equals("Apr")){
                    AprSubs++;}
                
                else if (month.equals("May")){
                    MaySubs++;} 
                
                else  if (month.equals("Jun")){
                    JunSubs++;}
                
                else   if (month.equals("Jul")){
                    JulSubs++;}
                
                else   if (month.equals("Aug")){
                    AugSubs++;}
                
                else   if (month.equals("Sep")){
                    SepSubs++;}
                
                else   if (month.equals("Oct")){
                    OctSubs++;} 
                
                else if (month.equals("Nov")){
                    NovSubs++;}
                
                else  if (month.equals("Dec")){
                    DecSubs++;}
            
            if (Monthly.equals("M")){
                MSubCounter++;
                JanMonthlyCost = MonthlyCost + ScanFile.nextInt();}
            
            if (Package.equals("B")){
                Bronze++;
            }
            else if (Package.equals("S")){
                Silver++;
            }
            else if (Package.equals("G")){
                Gold++;
            }
                   ScanFile.nextLine();  
                    
        }
        
                   
        if (Month == 1) {
            float truetotal = JanMonthlyCost/MSubCounter;
            
            System.out.println("Total number of subscriptions for January: "+JanSubs);
            System.out.printf("Average subscription fee: " +  "£%.2f "   , (truetotal)/100);
            System.out.println("\n");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: "+ (Bronze/JanSubs)*100);
            System.out.println("Silver: "+ (Silver/JanSubs)*100);
            System.out.println("Silver: "+ (Gold/JanSubs)*100);
            System.out.println("");
        }
            
        else if (Month ==2){
            System.out.println("Total number of subscriptions for January: "+FebSubs);
            System.out.printf("Average subscription fee: ");
            System.out.println("\n");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: "+ (Bronze/FebSubs)*100);
            System.out.println("Silver: "+ (Silver/FebSubs)*100);
            System.out.println("Silver: "+ (Gold/FebSubs)*100);
            System.out.println("");
        }
        else if (Month ==3){
            System.out.println("Total number of subscriptions for January: "+MarSubs);
            System.out.printf("Average subscription fee: " );
            System.out.println("\n");
            System.out.println("Percentage of subscriptions: ");
            System.out.println("Bronze: "+ (Bronze/MarSubs)*100);
            System.out.println("Silver: "+ (Silver/MarSubs)*100);
            System.out.println("Silver: "+ (Gold/MarSubs)*100);
            System.out.println("");
        }
        
            
            
        
    }
    
    
}
