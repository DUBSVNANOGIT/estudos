Exercício 3 - VETOR
    Uma palavra é chamada de PALÍNDROMA, quando sua leitura feita da esquerda para a direita ou da direita para a esquerda, resulta no mesmo texto. Veja alguns exemplos: ANNA, OVO, OTTO, ABA, HANNAH, ARARA, MIRIM, REVER, etc.
    Faça um MÉTODO que receba como parâmetro um vetor de caracteres de 8 elementos e retorne TRUE, se a palavra for PALÍNDROMA ou FALSE, se a palavra não for PALÍNDROMA

R:

public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
String str = sc.nextLine();
System.out.println(palin(str));
}
public static boolean palin (String str){
char[] palavra = str.toCharArray();
int count = 0;
for (int i = 0; i < palavra.length / 2; i++) { // corre para frente
if (palavra[i] == palavra[palavra.length - 1]) {
count++;
}
}
return count >= (palavra.length / 2);
}