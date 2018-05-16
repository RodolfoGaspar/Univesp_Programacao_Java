class Exerc_1 {
      public static void main(String[] args) {
        float vReal;
        float tCambioDolar;
        float vDolar;

        vDolar = 5;
        tCambioDolar = 3.6F;

        vReal = converteMoeda(vDolar, tCambioDolar);
       }

       public static float converteMoeda(float valor, float taxa)
       {
         return valor * taxa
       }
}
