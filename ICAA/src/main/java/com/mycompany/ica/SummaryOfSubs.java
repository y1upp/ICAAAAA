
package com.mycompany.ica;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class SummaryOfSubs {
    
    void SummaryOfSub(){  
    
        try {
        
        Scanner Scanner = new Scanner (System.in);        
    
    System.out.println("Please chose a file, either current or sample");
    
    
    
    File current = new File("C:\\Users\\joshu\\OneDrive\\Documents\\ica\\OOICA\\a0123456_OO\\SubscriptionManager\\ICA\\src\\main\\java\\com\\mycompany\\ica\\current.txt");
    File sample = new File("C:\\Users\\joshu\\OneDrive\\Documents\\ica\\OOICA\\a0123456_OO\\SubscriptionManager\\ICA\\src\\main\\java\\com\\mycompany\\ica\\sample.txt");    
    
    Scanner readCurrent = new Scanner(current);
    Scanner readerSample = new Scanner(sample);
    String FileName = Scanner.nextLine();
    while (readCurrent.hasNextLine()) {
        String data = readCurrent.nextLine();
        System.out.println(data);
    while (readerSample.hasNextLine()) {
        String datasample = readerSample.nextLine();
        System.out.println(data);
    
    }
    }
        }
        catch (IOException e){
            e.printStackTrace();}
    }
}