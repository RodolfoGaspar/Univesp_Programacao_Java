/*Atividade para avaliação da Semana 3*/

/*
Para realizar a conversão de temperaturas como Celsius, Fahrenheit e Kelvin são utilizadas as seguintes fórmulas:

Celsius LaTeX: \leftrightarrow &leftrightarrow; Fahrenheit:
LaTeX: \frac{TC}{5} =\frac{TF-32}{9} TC5=TF−329

onde LaTeX: TCTC corresponde à temperatura em graus Celsius e LaTeX: TFTF em Fahrenheit.

Celsius LaTeX: \leftrightarrow &leftrightarrow; Kelvin:
LaTeX: TK=TC+273TK=TC+273

onde LaTeX: TKTK corresponde à temperatura em Kelvin

Kelvin LaTeX: \leftrightarrow &leftrightarrow; Fahrenheit:
LaTeX: \frac{TK-273}{5} =\frac{TF-32}{9} TK−2735=TF−329

Com o objetivo de escrever um método para conversão de temperaturas, seguem as seguintes orientações:

O método recebe como parâmetros um valor double representando uma temperatura, e um valor inteiro representando um código de conversão de temperaturas.
O método deve então converter de um sistema para outro, entre Celsius, Fahrenheit e Kelvin, conforme o código fornecido;
Retornar o resultado dessa conversão;
Qualquer outro valor deve fazer o método retornar Double.NaN.

Os possíveis valores informados como código de conversão são:

Para converter Celsius em Fahrenheit: a temperatura informada estará em Celsius, e o método retornará o valor correspondente em Fahrenheit;
Para converter Fahrenheit em Celsius: a temperatura informada estará em Fahrenheit, e o método retornará o valor correspondente em Celsius;
Para converter Kelvin em Celsius: a temperatura informada estará em Kelvin, e o método retornará o valor correspondente em Celsius;
Para converter Celsius em Kelvin: a temperatura informada estará em Celsius, e o método retornará o valor correspondente em Kelvin;
Para converter Fahrenheit em Kelvin: a temperatura informada estará em Fahrenheit, e o método retornará o valor correspondente em Kelvin;
Para converter Kelvin em Fahrenheit: a temperatura informada estará em Kelvin, e o método retornará o valor correspondente em Fahrenheit.
*/

/*
//1-Celsius para Fahrenheit
0->32
//2-Fahrenheit para Celsius
0->-17,7778
//3-Celsius para Kelvin
0->273,15
//4-Kelvin para Celsius
0->-273,15
//5-Fahrenheit para Kelvin
0->255,372222222
//6-Kelvin para Fahrenheit
0->-459,67
*/

class ConversaoDeTemperatura {
      public static void main(String[] args) {
        System.out.println("Iniciando conversão de temperatura...\n");
        double temperatura;

        temperatura = 0; //Celsius
        System.out.println("1-> " + temperatura + " Grau Celsius = " + ConverteTemperatura(temperatura,1) + " Grau Fahrenheit");

        temperatura = 0; //Fahrenheit
        System.out.println("2-> " + temperatura + " Grau Fahrenheit = " + ConverteTemperatura(temperatura,2) + " Grau Celsius");

        temperatura = 0; //Celsius
        System.out.println("3-> " + temperatura + " Grau Celsius = " + ConverteTemperatura(temperatura,3) + " Grau Kelvin");

        temperatura = 0; //Kelvin
        System.out.println("4-> " + temperatura + " Grau Kelvin = " + ConverteTemperatura(temperatura,4) + " Grau Celsius");

        temperatura = 0; //Fahrenheit
        System.out.println("5-> " + temperatura + " Grau Fahrenheit = " + ConverteTemperatura(temperatura,5) + " Grau Kelvin");

        temperatura = 0; //Kelvin
        System.out.println("6-> " + temperatura + " Grau Kelvin = " + ConverteTemperatura(temperatura,6) + " Grau Fahrenheit");

        System.out.println("7-> " + ConverteTemperatura(temperatura,7) + "");
      }

      public static double ConverteTemperatura(double temperatura, int tipoConversao){

        switch(tipoConversao)
        {
          case(1): //Celsius para Fahrenheit
            return ((temperatura/5)*9)+32; //Fahrenheit
          case(2): //Fahrenheit para Celsius
            return ((temperatura-32)*5)/9; //Celsius
          case(3): //Celsius para Kelvin
            return temperatura+273; //Kelvin
          case(4): //Kelvin para Celsius
            return temperatura-273; //Celsius
          case(5): //Fahrenheit para Kelvin
            return ((temperatura-32)*5)/9+273; //Kelvin
          case(6): //Kelvin para Fahrenheit
            return (((temperatura-273)*9)/5)+32; //Fahrenheit
        }

        return (Double.NaN);
      }
}
