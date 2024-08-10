package application;
import java.util.Scanner;
import java.util.Locale;
public class Program {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       System.out.println("Quantos alunos serão digitados? ");
       int n = sc.nextInt();
       double media = 6;
       String[] nomes = new String[n];
       double[] n1 = new double[n], n2 = new double[n];
       for (int i = 0; i < n; i++) {
           System.out.printf("Digite nome, primeira e segunda nota do %d° aluno: \n", i + 1);
           sc.nextLine();
           nomes[i] = sc.nextLine();
           n1[i] = sc.nextDouble();
           n2[i] = sc.nextDouble();
       }
       System.out.println("Alunos aprovados: ");
       for (int i = 0; i < n;i++) {
           if((n1[i] + n2[i]) / 2 >= media) {
               System.out.println(nomes[i]);
           }
       }
       sc.close();
    }
}
