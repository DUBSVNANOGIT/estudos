Escreva um programa em Java para calcular o maior divisor comum (MDC) entre dois números
inteiros positivos usando o algoritmo de Euclides.
De acordo com a Wikipedia, o algoritmo de Euclides baseia-se no princípio de que o MDC não muda
se o menor número for subtraído do maior. Por exemplo, 21 é MDC de 252 e 105 (252 = 21 x 12 e
105 = 21 x 5) e dado que 252 – 105 = 147, o MDC de 147 e 105 também é 21.
Como o maior dos dois números é reduzido, a repetição deste processo irá gerar sucessivamente
números menores, até convergir em zero. Nesse momento, o MDC é o outro número inteiro, maior
que zero.