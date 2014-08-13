/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfredbigdata;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ainacio
 */
public class AlfredsFileReader {

    public static HashSet<String> readFile(String aFile) throws FileNotFoundException {
        HashSet<String> set = new HashSet<>();
        File file = new File(aFile);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            set.add(line);
        }
        return set;
    }

}
