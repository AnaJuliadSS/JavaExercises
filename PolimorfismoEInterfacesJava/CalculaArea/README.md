## 1. Implemente uma aplicação em Java que utiliza polimorfismo e interfaces. Crie um
programa para calcular a área de diferentes formas geométricas (círculo,
retângulo e triângulo) usando polimorfismo e uma interface comum para todas
as formas:

### Passo 1: Entendimento do Problema
O objetivo é criar um programa em Java para calcular a área de diferentes formas
geométricas, como círculos, retângulos e triângulos. Para isso, utilizaremos
conceitos de polimorfismo e interfaces.

### Passo 2: Identificação dos Requisitos
As diferentes formas geométricas que precisamos suportar são círculo, retângulo
e triângulo e as operações comuns que elas compartilham é calcular a área.

### Passo 3: Definição da Interface
No nosso caso, criaremos uma interface chamada Forma com um método
calcularArea()

### Passo 4: Implementação das Classes
Cada forma geométrica círculo, retângulo e triângulo será uma classe que
implementa a interface Forma.

### Passo 5: Teste do Programa
criar instâncias das diferentes formas geométricas e calcular suas áreas. Isso pode
ser feito na classe principal Main do programa.

Neste exercício, a interface Forma define o método calcularArea(), que é implementado
pelas classes Circulo, Retangulo e Triangulo. Isso permite que diferentes formas
geométricas sejam tratadas de forma polimórfica, ou seja, como objetos do tipo Forma,
facilitando a extensão do programa para incluir novas formas geométricas no futuro.