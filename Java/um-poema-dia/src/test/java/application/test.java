package application;
import java.io.File;

public class test {
    public static void main(String[] args) {
            File pasta = new File("/home/blunshee/Downloads/");
            File[] listaArquivos = pasta.listFiles();
            System.out.println(listaArquivos.length);

    }
}
