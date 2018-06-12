/*
Observe as orientações abaixo com o objetivo de escrever um
método que conta o número de elementos pares de uma matriz
bidimensional:

1 - O método deve receber uma matriz bidimensional de inteiros
como parâmetro;
2 - O método deve contar os números pares na matriz;
3 - Deve ser retornado o número de elementos pares existentes
nessa matriz.

De acordo com as informações acima, escolha qual das alternativas
abaixo representa o código que retorna a quantidade de elementos
pares de uma matriz bidimensional:
*/

class BiMatriz {
    public static void main(String[] args){
      int numeros[][] = new int[10][10];
      int x = 0;
      for (int i = 0;i<10 ;i++ ) {
        for (int j = 0;j<10 ; j++ ) {
          numeros[i][j] = x++;
          System.out.print(numeros[i][j] + "|");
        }
        System.out.println();
      }
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
      System.out.println("Tamanho da Matriz: " + numeros.length);
      System.out.println(pares(numeros));
    }

    static int pares(int[][] m) {
      int total = 0;
      for (int i=0; i<m.length; i++)
        for (int j=0; j<m[0].length; j++)
          if (m[i][j] % 2 == 0) total++;

          return(total);
    }
  }
