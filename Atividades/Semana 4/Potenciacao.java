/*
A potenciação serve para simplificar cálculos com números extensos, e em programação isso é muito mais simplificado, apenas utiliza-se a função LaTeX: \mathtt{math.pow} . Uma outra forma para realizar cálculos dessa natureza é utilizando o laço de repetição for através de um método que tem como parâmetros valores LaTeX: \mathtt{double} e LaTeX: \mathtt{int}.

Com base na informação acima, realize o cálculo da potenciação utilizando o laço de repetição LaTeX: \mathtt{for} conforme as orientações abaixo:

- Escreva um método em que receba em seus parâmetros um valor LaTeX: \mathtt{double \,\,x} e um inteiro LaTeX: \mathtt{y};

- O método deve retornar um valor double de LaTeX: x^yxy;

- Considerar o valor de LaTeX: y \ge0.

De acordo com as recomendações acima, o código correto para o cálculo da potenciação é:

 */

class Potenciacao {
    public static void main(String[] args) {

        System.out.println("Iniciando conversão de temperatura...\n");
        System.out.println(eleva(2,4));

    }

    static double eleva (double x, int y) {

        double resp = 1;

        for (int i=0; i<y; i++)

            resp *= x; // ou resp = resp * x;

        return(resp);

    }
}