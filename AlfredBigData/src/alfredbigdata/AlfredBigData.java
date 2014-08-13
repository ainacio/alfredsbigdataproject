/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredbigdata;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ainacio
 */
public class AlfredBigData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            String current = new java.io.File( "." ).getCanonicalPath();
            current = current + "/bad-words.txt";
           HashSet<String> set = AlfredsFileReader.readFile(current);
           
           new AlfredsProfanityFilter(set);
           
           String testString = "You are a fucking whore bitch cunt. I like to eat apples.";
           
           String result = AlfredsProfanityFilter.doFiltering(testString);
           
           System.out.println(result);
            
        } catch (IOException ex) {
            Logger.getLogger(AlfredBigData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
