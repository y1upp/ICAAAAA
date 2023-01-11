/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a0057107;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class SubSummaryCurrent {
    
    void PrintSummary()throws FileNotFoundException{
    
    System.out.println("");
        System.out.println("The following is a summary of subscriptions based on the text file current:");
        System.out.println("");
        
        int TotalSubs = 0; // counter
        int MSubCounter = 0; // counter
        
            
        float Bronze = 0; // counter
        float Silver = 0; // counter
        float Gold = 0; // counter
    
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
        
        File current = new File("current.txt");
        Scanner ScanFile = new Scanner(current);
        int MonthlyCost = 0;
        
        while (ScanFile.hasNextLine()) {
            String line = ScanFile.next();
            TotalSubs++;
            String month = line.substring(3, 6);
            String Package = ScanFile.next();
            ScanFile.next();
            ScanFile.next();
            String Monthly = ScanFile.next();

            
            if (month.equals("Jan")){
                JanSubs++;
            }
            else if (month.equals("Feb")){
                FebSubs++;
            }
            else if (month.equals("Mar")){
                MarSubs++;
            }
            else if (month.equals("Apr")){
                AprSubs++;
            }
            else if (month.equals("May")){
                MaySubs++;
            }
            else if (month.equals("Jun")){
                JunSubs++;
            }
            else if (month.equals("Jul")){
                JulSubs++;
            }
            else if (month.equals("Aug")){
                AugSubs++;
            }
            else if (month.equals("Sep")){
                SepSubs++;
            }
            else if (month.equals("Oct")){
                OctSubs++;
            }
            else if (month.equals("Nov")){
                NovSubs++;
            }
            else if (month.equals("Dec")){
                DecSubs++;
            }
            else{}
            
            if (Package.equals("B")){
                Bronze++;
            }
            else if (Package.equals("S")){
                Silver++;
            }
            else if (Package.equals("G")){
                Gold++;
            }
            
            if (Monthly.equals("M")){
                MSubCounter++;
                MonthlyCost = MonthlyCost + ScanFile.nextInt();
            }
               
           ScanFile.nextLine();
           
        }
          
        float truetotal = MonthlyCost/MSubCounter;
        
        ScanFile.close();
        int AverageMonthlySubCounter = (JanSubs + FebSubs + MarSubs + AprSubs + MaySubs + JunSubs + JulSubs + AugSubs + SepSubs + OctSubs + NovSubs + DecSubs)/12;
        System.out.println("Total number of subscriptions: "+TotalSubs);
        System.out.println("Average monthly subscriptions: "+AverageMonthlySubCounter);
        System.out.printf("Average monthly subscription fee: "+  "£%.2f "   , (truetotal)/100);
        System.out.println("\n");
        System.out.println("Percentage of subscriptions:");
        System.out.println("Bronze:" + (Bronze/TotalSubs)*100);
        System.out.println("Silver:" + (Silver/TotalSubs)*100);
        System.out.println("Gold:" + (Gold/TotalSubs)*100);
        System.out.println("");
        System.out.println("Jan   Feb   Mar   Apr   May   Jun   Jul   Aug   Sep   Oct   Nov   Dec");
        System.out.print(JanSubs);
        System.out.print("    "+FebSubs);
        System.out.print("    "+MarSubs);
        System.out.print("    "+AprSubs);
        System.out.print("     "+MaySubs);
        System.out.print("    "+JunSubs);
        System.out.print("    "+JulSubs);
        System.out.print("   "+AugSubs);
        System.out.print("    "+SepSubs);
        System.out.print("    "+OctSubs);
        System.out.print("    "+NovSubs);
        System.out.print("    "+DecSubs);
        System.out.println("\n");
}
}