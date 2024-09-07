package teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program {
	public static void main(String[] args) {
		Path arq_livros = Paths.get("D:\\Notas\\ps2_p_s01\\src\\teste\\livros.txt");
		try {
		String[] livros = Files.readAllLines(arq_livros).toArray(new String[0]);
		for (String livro: livros) {
			System.out.println(livro);
		}
		} catch (IOException e ) {
			e.printStackTrace();
		}
	}
}
