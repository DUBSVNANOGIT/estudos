package application;

import java.util.*;
import java.io.*;
import java.lang.String;
import java.util.ArrayList;

public class PoemaController {

    private List<Poema> poemas;

    public PoemaController() {
        this.poemas = formarPoemaComLinhas();
    }


    public List<Poema> formarPoemaComLinhas() {
        File folder = new File ("/home/blunshee/projects/Estudo/Java/um-poema-dia/poemas/");
        File[] lPoemas = folder.listFiles();
        for (int i = 0; i <= lPoemas.length; i++) {
            try (BufferedReader BR = new BufferedReader(new FileReader(lPoemas[i]))) {
                List<String> lp = new ArrayList<>();
                StringBuilder sb = new StringBuilder();
                String linha = BR.readLine();
                sb.append(linha + "\n");
                while(linha != null) {
                    lp.add(linha);
                    sb.append(linha + "\n");
                    linha = BR.readLine();
                }
                poemas.add(new Poema(lp.get(0), sb.substring(0), lp.get(lp.size())));
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return poemas;
    }

    public void declamarPoemas() {
        System.out.println(poemas.get(geradorIndexRandom()).declamar());
    }

   public int geradorIndexRandom() {
        Random r = new Random();
        return r.nextInt(2);
    }
}
