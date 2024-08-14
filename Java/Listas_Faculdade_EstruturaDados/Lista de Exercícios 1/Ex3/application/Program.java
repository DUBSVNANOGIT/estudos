package application;

public class Program {
    public static void main(String[] args) {
        String str = "ovo";
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
}
