
package a0057107;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
        

 
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException  {
        
        Display Display = new Display();
        Display.display();
        
        System.out.println("");
        System.out.println("The following is a summary of subscriptions based on the text file current:");
        System.out.println("");
        
        
        
        int TotalSubs = 0; // counter
        int SubCounter = 0; // counter
        int MonthlySubCounter = 0;
        
        int AverageMonthSubFee = 0;
        int dateCounter = 0;
            
        int Bronze = 0; // counter
        int Silver = 0; // counter
        int Gold = 0; // counter
    
        int BronzePercentage = 0;
        int silverPercentgae = 0;
        int GoldPercentage = 0;
   
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
        
        while (ScanFile.hasNextLine()) {
            String line = ScanFile.nextLine();
            TotalSubs++;
            String month = line.substring(3, 6);
            String Subb = line.substring(12, 13);
            String Monthly = line.substring(24, 25);
            
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
            
            
            //System.out.println("hellow");
        }
        
        while (ScanFile.hasNextLine()) {
            String line = ScanFile.nextLine();
            String Subb = line.substring(12, 13);
            
        if (Subb.equals("B")){
                Bronze++;
            }
        else if (Subb.equals("S")){
                Silver++;
            }
        else if (Subb.equals("G")){
                Gold++;
            }
       
    }
       // System.out.println("goodbye");
        ScanFile.close();
        int AverageMonthlySubCounter = (JanSubs + FebSubs + MarSubs + AprSubs + MaySubs + JunSubs + JulSubs + AugSubs + SepSubs + OctSubs + NovSubs + DecSubs)/12;
        System.out.println("Total number of subscriptions: "+TotalSubs);
        System.out.println("Average monthly subscriptions: "+AverageMonthlySubCounter);
        System.out.println("Average monthly subscription fee: ");
        System.out.println("");
        System.out.println("Percentage of subscriptions:");
        //System.out.println(Subb);
        System.out.println("Bronze:" + Bronze);
        System.out.println("Silver:" + Silver);
        System.out.println("Gold:" + Gold);
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
            
          System.out.println("bih");

            
         
    } 
       
}
