package application;

public class Program {
    public static void main(String[] args) {
        tabelaDeTemperatura(-10, 10, 2);
        
    }

    //override
    static void tabelaDeTemperatura (int nMenor, int nMaior, int passo) {
        while (nMaior >= nMenor) {
            System.out.printf("%d °C <-> %.2f ° F", nMaior, celsiusToFahrenheit(nMaior));
            System.out.println();
            nMaior = nMaior - passo;
        }
    }

    //default
    static void tabelaDeTemperatura (int nMenor, int nMaior) {
        while (nMaior >= nMenor) {
            System.out.printf("%d °C <-> %.2f ° F", nMaior, celsiusToFahrenheit(nMaior));
            System.out.println();
            nMaior = nMaior - 5;
        }
    }
    static double celsiusToFahrenheit(double C) {
        return (C * (9.0 / 5.0)) + 32;
    }
}
