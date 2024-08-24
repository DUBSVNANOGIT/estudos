package application;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] mat1 = new int[4][4];
		
		for(int i =0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[0].length; j++) {
				mat1[i][j] = sc.nextInt();
				
			}
		}
		
		for(int i = mat1.length - 1; i >= 0; i--) {
			for (int j = mat1[0].length - 1; j >= 0; j--) {
				if (i == j) {
					System.out.println(mat1[i][j]);
				}
			}
		}
	}

}
