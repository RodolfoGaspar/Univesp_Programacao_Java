/*
 Enunciado Base

Os polinômios são expressões algébricas formadas por um arranjo de coeficientes e
letras (partes literais). As letras (por exemplo, a variável LaTeX: xx) de um
polinômio representam os valores desconhecidos da expressão. O cálculo de um
polinômio depende do valor dessa variável LaTeX: xx. O grau do polinômio é definido
pelo número de elementos do arranjo. Por exemplo, para o polinômio
LaTeX: p(x)=a_0+a_1x+a_2x^2+a_3x^3p(x)=a0+a1x+a2x2+a3x3, o arranjo de coeficientes
conterá LaTeX: \{a_0,a_1,a_2,a_3\}{a0,a1,a2,a3}, sendo seu grau (3) obtido a
partir do tamanho do arranjo.

Baseado nas informações acima, observe as recomendações a seguir para a escrita
de um método que calcule o valor de um polinômio em um determinado ponto LaTeX: xx:

- O método deve receber um double que representa o ponto LaTeX: xx e um arranjo de
doubles, representando os coeficientes do polinômio;

- O método deverá retornar como resposta o valor de LaTeX: p(x)p(x) recebendo
LaTeX: xx e o arranjo de coeficientes por parâmetro;

- Para elevar os LaTeX: xx a seus expoentes, crie um método de potenciação ou
utilize um método já anteriormente abordado.

Pergunta 3

Para começarmos a calcular o valor do polinômio, é necessário que nos parâmetros
tenhamos um arranjo de doubles. Arranjos são estruturas de dados, de tamanho
fixo, que permitem armazenar um conjunto de valores de um mesmo tipo. Para a
implementação de um arranjo de doubles de tamanho 10, o código correto
está na alternativa:

Pergunta 4

Objetivo de aprendizagem: Calcular o valor de um polinômio utilizando o laço
de repetição for.

Com base nas orientações apresentadas, o código para o cálculo do valor de
um polinômio LaTeX: p(x)p(x) é:
*/

class Polinomio {
    public static void main(String[] args) {
        System.out.println("Iniciando cálculo de polinomios...\n");

        int x=3;
        double[] d = new double[x];

        for (int i=0; i<x; i++){
            d[i] = i;

            System.out.println("O vetor de double na posição "+i+ " é: "+d[i]);
        }

        System.out.println(valor(x, d));
    }

    //A
    static double valor(double x, double[] coef) {
        double resp = 0;

        for (int i=0; i<coef.length; i++)
            resp += coef[i] * eleva (x, i); // ou resp = resp + coef[i] * eleva (x, i);

        return(resp);
    }


    static double eleva (double x, int y) {

        double resp = 1;

        for (int i=0; i<y; i++)

            resp *= x; // ou resp = resp * x;

        return(resp);

    }
}