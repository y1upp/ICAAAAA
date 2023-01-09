
package com.mycompany.ica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
        


public class Main {
    
    public static void main(String[] args) {
        
        Display Display = new Display();
        SummaryOfSubs SummaryOfSubs = new SummaryOfSubs();
        
        Display.display();
        SummaryOfSubs.SummaryOfSub();
    
    } 
        
}
