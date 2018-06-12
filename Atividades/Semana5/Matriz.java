/*
Uma imagem digital é o emprego mais comum de uma matriz em um
computador. Cada elemento da matriz, formado por linhas e colunas,
é denominado de pixel. Cada pixel descreve uma cor para aquele
ponto da imagem. Pode-se dizer que o ponto é uma matriz com
dimensões n x m, em que n representa a linha e m a coluna.

Com base no enunciado acima, assinale qual das alternativas abaixo
representa o método que gera uma matriz de dimensões 10x10 de
números aleatórios:
*/

class Matriz {
    public static void main(String[] args){
      double[][] m = new double[10][10];
      for (int i=0; i<10; i++){
        for (int j=0; j<10; j++){
          m[i][j] = Math.random();
          System.out.print(Math.round(m[i][j]) + "|");
        }
        System.out.println();
      }
    }
  }
