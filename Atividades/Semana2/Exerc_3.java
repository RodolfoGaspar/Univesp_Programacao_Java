/*
Escreva um método que determine quanto tempo leva para um corpo
cair de determinada altura a partir do repouso. Este método receberá
como parâmetro um valor do tipo double contendo a altura em cen-
tímetros em que o corpo está e deverá retornar um valor do tipo dou-
ble contendo o tempo da queda em segundos. Considere que a força da
gravidade é igual a 9, 8m/s 2 . Use o método Math.sqrt() 1 para obter a raiz
quadrada.
*/

class Exerc_3 {
      public static void main(String[] args) {
        System.out.println("Iniciando cálculo de velocidade de queda...\n");

        float altura = 1800; //altura em centimetros
        float alturaEmMetros = altura/100; //altura em metros
        double tQueda; //tempo de queda em sengundos
        final float fGravidade = 9.8F;

        System.out.println("Altura: " + altura + "cm\n");
        System.out.println("Altura: " + alturaEmMetros + "m\n");
        System.out.println("Força da Gravidade: " + fGravidade + "m/s²\n");

        tQueda = calculaTempoDeQueda(alturaEmMetros, fGravidade);

        System.out.println("Tempo de queda: " + tQueda + "s");
      }

      static double calculaTempoDeQueda(float alturaEmMetros, float fGravidade){
        return Math.sqrt(2*alturaEmMetros/fGravidade);
      }
}
