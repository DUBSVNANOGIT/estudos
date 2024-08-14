Exercício 1 - Para cada uma das seguintes funções, escreva uma frase que descreva o que ela faz. Tente identificar o papel de cada variável na função.

public static int banana (int[] a) {
int uva = 0;
int i = 0;
while (i < a.length) {
uva = uva + a[i];
i++;
}
return uva;
}
R: Durante o loop while, enquanto i for menor que o tam. do vetor 'a', a variável 'uva' será somada ao valor contido no vetor 'a' na posição de 'i'.

public static int abacate (int[] a, int p) {
int i = 0;
int pera = 0;
while (i < a.length) {
if (a[i] == p) pera++;
i++;
}
return pera;
}
R: Durante o loop while, enquanto i for menor que o tam. do vetor 'a', SE 'a' na posição 'i' for igual ao parâmetro 'p', a variável 'pera' terá um acréscimo de 1. No final o contador 'pera' será retornado simbolizando quantos valores no vetor 'a' são iguais a 'p'.

public static int morango (int[] a, int p) {
for (int i = 0; i<a.length; i++)
if (a[i] == p)
return i;
return -1;
}
R: Durante o loop for, enquanto i for menor que o tam. do vetor 'a', SE a posição 'i' do vetor 'a' for igual ao valor de 'p', será retornado 'i', significando a posição onde a semelhança ocorre.
