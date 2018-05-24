/*
Um primo é um número divisível apenas por 1 e por ele mesmo. A seguir tem-se instruções para a criação de um método que faz a verificação de números primos.

O método deve receber um valor inteiro (int) positivo como parâmetro;
Retornar true se o inteiro for um número primo e false se não. Você pode assumir o inteiro como sendo positivo, ou seja, não precisa testar essa condição.
Usando o laço de repetição while, teste o resto da divisão desse número por 2, 3, . . ., até o inteiro anterior a ele. Se o resto de alguma dessas divisões for zero, então ele não é primo. Se após testar todos, nenhuma divisão resultou em resto zero, então ele só é divisível por 1 e por ele mesmo, ou seja, é primo.
*/

class NumeroPrimo {
      public static void main(String[] args) {
        primo(20);
      }

      static boolean primo(int n) {
        int div = 2;
        System.out.print("Divindindo "+ n +" por " + div +".");

        int resto = 0;

        while (n>div) {
          resto = n % div;
          if (resto == 0) {
            System.out.println(" -> Resto: "+ resto);
            System.out.println("\n"+ n + " é primo.");

            return(true);
          }
          System.out.println(" -> Resto: "+ resto);
          div++; //ou div = div+1 ou ++div
          System.out.print("Divindindo "+ n +" por " + div + ".");
        }
        System.out.println(" -> Resto: "+ resto);
        System.out.println("\n" + n + " não é primo");
        return(false);
      }
}
