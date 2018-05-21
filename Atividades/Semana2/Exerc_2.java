/*
Escreva um método que converta um valor em real (recebido em um
parâmetro), para dólar e retorne o valor em dólar. A taxa de conversão
real para dólar também será um parâmetro de entrada desse método. Ovalor em real, a taxa de conversão e o valor em dólar deverão ser do tipo
float.
*/

class Exerc_2 {
      public static void main(String[] args) {
        System.out.println("Iniciando conversão de moeda");

        float vReal;
        float tCambioDolar;
        float vDolar;

        vDolar = 5.1;
        tCambioDolar = 3.6F;

        System.out.println("Dólar: US$"+vDolar);
        System.out.println("Cotação: "+tCambioDolar);

        vReal = converteMoeda(vDolar, tCambioDolar);

        System.out.println("Valor final: R$"+vReal);
       }

       public static float converteMoeda(float valor, float taxa)
       {
         return valor * taxa;
       }
}
