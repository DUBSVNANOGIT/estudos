package entities;

public class Estudante {
    public String nome;
    public double semestreUm;
    public double semestreDois;
    public double semestreTres;
    public double corte = 60;


    public void veredito() {
        double nFinal = semestreUm + semestreDois + semestreTres;
        System.out.printf("NOTA FINAL = %.2f\n", nFinal);

        if (nFinal > corte) {
            System.out.println("APROVADO");
        }
        else {
            System.out.println("REPROVADO");
            System.out.printf("FALTAM %.2f PONTOS", corte - nFinal);
        }
    }

}
