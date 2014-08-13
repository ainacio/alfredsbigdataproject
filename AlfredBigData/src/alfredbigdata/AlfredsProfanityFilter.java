/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alfredbigdata;

import java.util.HashSet;

/**
 *
 * @author ainacio
 */
public class AlfredsProfanityFilter {
    
    private static HashSet<String> _badWords;
    
    public static String doFiltering (String aString)
    {
        String[] words = aString.split("\\s+");
        String returnString = "";
        for (int i = 0; i < words.length; i++)
        {
            if (_badWords.contains(words[i]))
            {
                words[i] = "****";
            }
            returnString += words[i] + " ";
        }
        return returnString;
    }
    
    public AlfredsProfanityFilter(HashSet<String> aBadWords)
    {
        _badWords = aBadWords;
    }
    
    
    
    
}
