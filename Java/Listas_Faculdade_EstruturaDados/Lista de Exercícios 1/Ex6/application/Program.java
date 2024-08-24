package application;
import java.util.Scanner;
public class Program {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	int[][] mat1 = new int[4][4];
	
	System.out.println("Digite os valores para a Matriz: ");

	for(int i = 0; i < mat1.length; i ++) {
		for (int j = 0; j < mat1[0].length; j++) {
			mat1[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("Diagonal");
	for(int i = 0; i < mat1.length; i ++) {
		for (int j = 0; j < mat1[0].length; j++) {
			if (i == j) {
				System.out.println(mat1[i][j] + " ");
			};
		}
		System.out.println();
	}
	
	}
}
