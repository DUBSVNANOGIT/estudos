package application;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        {

            //Apenas com File
//        File file = new File("C:\\Users\\Duqo\\Desktop\\Estudo\\Java\\Listas_Udemy\\Lista de Exercícios 11\\Ex-1\\frases.txt");
//        Scanner sc = null;
//        try {
//            sc = new Scanner(file);
//            while(sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//        }
//        catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        finally {
//            if (sc != null) {
//                sc.close();
//            }
//        }
//
//        //Com BufferedReader e FileReader Comum
//        String path = "C:\\Users\\Duqo\\Desktop\\Estudo\\Java\\Listas_Udemy\\Lista de Exercícios 11\\Ex-1\\frases.txt";
//        FileReader fr = null;
//        BufferedReader br = null;
//        try {
//            fr = new FileReader(path);
//            br = new BufferedReader(fr);
//            String line = br.readLine();
//            while(line != null) {
//                System.out.println(line);
//                line = br.readLine();
//            };
//        }
//        catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        finally {
//            try {
//                if (br != null) {
//                    br.close();
//                }
//                if(fr != null) {
//                    fr.close();
//                }
//            }
//            catch (IOException e) {
//                e.printStackTrace();
//            };
//        };
//
//        //Bloco Try-With-Resources
//        try (BufferedReader BR = new BufferedReader(new FileReader(path))) {
//            String line = BR.readLine();
//            while(line != null) {
//                System.out.println(line);
//                line = BR.readLine();
//            };
//        }
//        catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//        //FileWriter e BufferedWriter
//        String[] vetLines = new String[] {"Em um dia feliz gosto de ir na padaria", "Em um dia triste eu gosto de ficar no quarto", "Em um dia comum eu gosto de estudar."};
//
//        String out = "C:\\Users\\Duqo\\Desktop\\Estudo\\Java\\Listas_Udemy\\Lista de Exercícios 11\\Ex-1\\oquefaco.txt";
//
//        try (BufferedWriter BW = new BufferedWriter(new FileWriter(out, true))) { //o true possibilita a edição do arquivo correspondente, não o substituindo por outro
//            for (String s : vetLines) {
//                BW.write(s);
//                BW.newLine();
//            }
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
        }

//        //Manipulando Pastas com File
//        Scanner SC = new Scanner(System.in);
//        System.out.println("Enter a folder path: ");
//        String strPath = SC.nextLine();
//
//        //buscar por diretórios(folders)
//        File caminho = new File(strPath);
//        File[] folders = caminho.listFiles(File::isDirectory);//listar somente diretorios
//        System.out.println("Folders");
//        for (File f : folders) {
//            System.out.println(f);
//        }
//
//        //buscar arquivos(file)
//        File[] file = caminho.listFiles(File::isFile);
//        System.out.println("Files: ");
//        for (File f: file) {
//            System.out.println(f);
//        }
//
//        //criando subdiretório
//        boolean success = new File(strPath + "\\subdir").mkdir(); //processo criará uma subpasta a partir do caminho informado e retornará um boolean informando o suscessp
//        System.out.println("Diretório criado com sucesso!");
//    }

        //Informações do caminho do arquivo
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a file path: ");
        String strCaminho = SC.nextLine();
        File caminho = new File(strCaminho);

        System.out.println("getName: " + caminho.getName()); //pega o nome de um arquivo
        System.out.println("getParent: " + caminho.getParent()); //pega somente o diretório do arquivo
        System.out.println("getPath: " + caminho.getPath()); //pega o caminho por completo


        SC.close();

    }
}
