package application;

import entities.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String caminho = "C:\\Users\\Duqo\\Desktop\\Estudo\\Java\\Listas_Udemy\\Lista de Exercícios 11\\Ex1\\source.csv";
        List<Produto> produtos = new ArrayList<>();

        //popular um novo array com as informações lidas no arquivo e depois instanciar objetos na lista de objetos
        try (BufferedReader BR = new BufferedReader(new FileReader(caminho))) {
            String strProduto = BR.readLine();
            String[] campos;
            while (strProduto != null) {
                campos = strProduto.split(",");
                produtos.add(new Produto(campos[0], Double.parseDouble(campos[1]), Integer.parseInt(campos[2])));
                strProduto = BR.readLine();
            }

        }
        catch(IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        //criar um subdiretório "out" e dentro dele um novo arquivo com a o valor total de cada Produto
        String caminhoEscrita = "C:\\Users\\Duqo\\Desktop\\Estudo\\Java\\Listas_Udemy\\Lista de Exercícios 11\\Ex1\\out\\summary.csv";
        try (BufferedWriter BW = new BufferedWriter(new FileWriter(caminhoEscrita))) {
            for (Produto p : produtos) {
                BW.write(p.getNome() + "," + p.total());
                BW.newLine();
            }
        }
        catch (IOException  e) {
            e.printStackTrace();
        }


        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
