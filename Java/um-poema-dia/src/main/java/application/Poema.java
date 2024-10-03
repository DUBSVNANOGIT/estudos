package application;

import java.util.*;
import java.io.*;

public class Poema {
	private List<String> poema;
	private String autor;

	public Poema(){
		this.poema = lerTxt();
		this.autor = poema.get(poema.size() - 1);
	}
	
	public List<String> getLinhas(){
		return this.poema;
	}
	
	public String getAutor(){
		return this.autor;
	}
	
	List<String> lerTxt(){
		String path =  "/home/blunshee/projects/Estudo/Java/um-poema-dia/a1.txt";
		List<String> arquivos = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				arquivos.add(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arquivos;
	}

	void exibir() {
		for (int i = 0; i < poema.size() - 1; i++) {
			System.out.println(poema.get(i));
		}
		System.out.println(getAutor());
	}
}
