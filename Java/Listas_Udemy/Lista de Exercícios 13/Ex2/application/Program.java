package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\Users\\Duqo\\Desktop\\Estudo\\Java\\Listas_Udemy\\Lista de Exercícios 13\\Ex2\\in.csv";
        Map<String, Integer> votos = new LinkedHashMap<>();

        try (BufferedReader BR = new BufferedReader(new FileReader(path))) {
            String line = BR.readLine();
            while (line != null ) {
                String[] campos = line.split(",");
                String nome = campos[0];
                int count = Integer.parseInt(campos[1]);
                if (votos.containsKey(nome)) {
                    int votosT = votos.get(nome);
                    votos.put(nome, count + votosT);
                }
                else {
                    votos.put(nome, count);
                }
                line = BR.readLine();
            }
            for (String key : votos.keySet()) {
                System.out.println(key + ": " + votos.get(key));
            }

        }
        catch (IOException e) {
            System.out.println("ERRO: " + e.getMessage());
        }


    }
}
