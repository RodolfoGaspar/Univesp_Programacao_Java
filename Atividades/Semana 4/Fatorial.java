/*
* O fatorial de um número natural LaTeX: nn é utilizado na ciência matemática e também na ciência
* da computação. Seu uso é de extrema importância na análise combinatória, no cálculo e na teoria da
* probabilidade. O fatorial de um número LaTeX: nn é representado por LaTeX: n!n! e é calculado
* fazendo o produto de todos os números naturais menores ou iguais a LaTeX: nn.
* Quando o número natural é igual a LaTeX: 0, o seu fatorial é igual a LaTeX: 1.

De acordo com o que foi exposto, o método que descreve corretamente o fatorial do número LaTeX: 20 é:
* */

class Fatorial {
    public static void main(String[] args){
        long fat = 1;
        for (int i=1;i<=20;i++) {

            System.out.print(i);
            System.out.print("*");
            System.out.print(fat);
            System.out.print("=");

            fat *= i;

            System.out.println(fat);
        }

    }
}