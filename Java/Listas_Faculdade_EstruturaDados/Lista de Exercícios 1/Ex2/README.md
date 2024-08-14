Exercício 2 - Faça a análise completa do programa abaixo e indique o que será exibido na tela na linha sinalizada em amarelo.
    R: 30,

public class Exe2
public static void main (String[] args) {
int[] bob = make (5);
dub (bob);
_System.out.println (mus (bob));_
}

public static int[] make (int n) {
int[] a = new int[n];
for (int i=0; i<n; i++)
a[i] = i+1;
return a;
}

public static void dub (int[] jub) {
for (int i=0; i<jub.length; i++)
jub[i] *= 2;
}

public static int mus (int[] zoo) {
int fus = 0;
for (int i=0; i<zoo.length; i++)
fus = fus + zoo[i];
return fus;
}
}