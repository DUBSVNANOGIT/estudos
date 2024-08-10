package application;
import entities.Funcionario;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //criar funcionarios
        System.out.println("Quantos funcionários serão informados? ");
        int n = sc.nextInt();
        List<Funcionario> Funcionarios = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Funcionário #%d: ", i+1);
            System.out.println("Id: ");
            int id = sc.nextInt();
            while(hasId(Funcionarios,id)) {
                System.out.print("Id já está sendo utilizado, por favor, tente outro: ");
                id = sc.nextInt();
            }
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite o salário: ");
            double salario = sc.nextDouble();
        }

        // aumento de salario
        System.out.println("Insira o id do funcionário que deverá receber um aumento.");
        int id = sc.nextInt();
        Funcionario emp = Funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("Funcionario não exite!");
        }
        else {
            System.out.println("Digite o valor da porcentagem: ");
            double porcentagem = sc.nextDouble();
            emp.aumentoSalario(porcentagem);
        }
       //listar funcionarios
        System.out.println("Lista de Funcionarios");
        for (Funcionario i : Funcionarios) {
            System.out.println(i);
        }

        sc.close();

    }

    public static boolean hasId(List<Funcionario> Funcionarios, int id) {
        Funcionario emp = Funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
