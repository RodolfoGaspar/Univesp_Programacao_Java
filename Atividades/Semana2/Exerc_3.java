class Exerc_3 {
      public static void main(String[] args) {
        System.out.println("Iniciando cálculo de velocidade de queda...");

        float altura = 100; //altura em centimetros
        double tQueda; //tempo de queda em sengundos
        final float fGravidade = 9.8F;

        tQueda = calculaTempoDeQueda(altura, fGravidade);

        System.out.println(tQueda);
      }

      static double calculaTempoDeQueda(float altura, float fGravidade){
        return Math.sqrt(2*altura/100/fGravidade);
      }
}
