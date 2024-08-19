package application;

import entities.Semaforo;

public class Program {
    public static void main(String[] args) {
        Semaforo s1 = new Semaforo("Verde", 25);
        s1.alternarCor();
        s1.alternarCor();
    }
}
