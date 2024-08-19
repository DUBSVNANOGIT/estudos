package entities;
public class Semaforo {
    private String cor;
    private int tempo;
    public Semaforo () {}
    public Semaforo(String cor, int tempo) {
        this.cor = cor.toUpperCase();
        this.tempo = tempo;
    }
    public void alternarCor() {
        System.out.println("Mudando de Cor!");
        System.out.println("Cor atual: " + cor);
        System.out.println("Tempo: " + tempo + " segundos");
        System.out.println("Mudando...");
        if (cor.equals("VERDE")) {
            this.cor = "Amarelo".toUpperCase();
            this.tempo = 4;
            System.out.println("Cor: " + cor);
            System.out.println("Tempo: " + tempo + " segundos.");

        } else if (cor.equals("AMARELO")) {
            this.cor = "Vermelho".toUpperCase();
            this.tempo = 5;
            System.out.println("Cor: " + cor);
            System.out.println("Tempo: " + tempo + " segundos.");
        } else if (cor.equals("VERMELHO")) {
            this.cor = "Verde".toUpperCase();
            this.tempo = 25;
            System.out.println("Cor: " + cor);
            System.out.println("Tempo: " + tempo + " segundos.");
        }
    }
}
