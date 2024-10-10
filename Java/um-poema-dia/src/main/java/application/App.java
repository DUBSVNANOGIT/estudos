package application;

import java.util.*;
import java.io.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    lerPoemasDir();
    }
    
    static void lerPoemasDir() {
        File folder = new File ("/home/blunshee/projects/Estudo/Java/um-poema-dia/poemas/");
        System.out.println(folder.isFile() + " " + folder.isDirectory());
        File[] lPoemas = folder.listFiles();
        System.out.println(lPoemas.length);
        try (BufferedReader BR = new BufferedReader(new FileReader(lPoemas[0]))) {
            String poema = BR.readLine();
            while(poema != null) {
                System.out.println(poema);
                poema = BR.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

