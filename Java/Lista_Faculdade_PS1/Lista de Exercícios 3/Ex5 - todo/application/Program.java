package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int count =0;
        System.out.print("Escreva uma frase: ");
        String frase = sc.nextLine();
        for(int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == 'a'
            || frase.charAt(i) == 'e'
            || frase.charAt(i) == 'i'
            || frase.charAt(i) == 'o'
            || frase.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.printf("Esta frase tem %d vogais", count);

    }
}
