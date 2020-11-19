import java.util.Scanner;

class Matriz{
	int matriz[][], filas, columnas;
	
  public Matriz(int filas,int columnas,int matriz[][]){
	  this.filas = filas;
	  this.columnas = columnas;
    this.matriz = matriz;
  }
   
  public void Datos(){
    Scanner dato = new Scanner(System.in);

      for (int i=0; i < filas; i++) {
        for (int j=0; j < columnas; j++) {
          System.out.println("Ingrese el elemento ["+(i+1)+"] ["+(j+1)+"]: ");
          matriz[i][j]= dato.nextInt();
        }
      }
  }
  
  public void imprimirMatriz(){
    for (int i=0; i < filas; i++) {
      for (int j=0; j < columnas; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println("\n");   
    } 
  }

  public double determinante2(int[][] matriz)
  {
    double det;

    if(matriz.length==2)
    {
        det = (matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);

        /*if(det==0){
         System.out.print("La matriz NO es invertible\n");
        }*/
        
        return det;
    }

      double suma=0;

      for(int i=0; i<matriz.length; i++){

      int [][] nm = new int [matriz.length-1][matriz.length-1];

          for(int j=0; j<matriz.length; j++){
            if(j!=i){
              for(int k=1; k<matriz.length; k++){
                int indice=-1;
                if(j<i)
                  indice=j;
                else if(j>i)
                  indice=j-1;
                nm[indice][k-1]=matriz[j][k];
              }
            }
          }

        if(i%2==0){
          suma+=matriz[i][0] * determinante2(nm);
        }
        else{
          suma-=matriz[i][0] * determinante2(nm);
      }
      }
      
      /*if(suma==0){
        System.out.print("La matriz NO es invertible\n");
      }*/

    return suma;

  
  }
 /* public double cofactor(int matriz [][],int filas, int columnas){
 
        int submatriz[][];
        int n = matriz.length +1; //El detalle esta aqui
 
        submatriz = new int[n][n];
        int x = 0;
        int y = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i != filas && j != columnas) {
                    submatriz[x][y] = matriz[i][j];
                    y++;
                    if (y >= n) {
                        x++;
                        y = 0;
                    }
                }
            }
        }
  double m =(int)Math.pow(-1.0, filas + columnas) * determinante2(submatriz);
        return m;
  }*/
  public double[][] matrizCofactores(int [][] matriz){
        double[][] nm=new double[matriz.length][matriz.length];
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz.length;j++) {
                int [][] det=new int [matriz.length-1][matriz.length-1];
                double detValor;
                for(int k=0;k<matriz.length;k++) {
                    if(k!=i) {
                        for(int l=0;l<matriz.length;l++) {
                            if(l!=j){
                                int indice1=k<i ? k : k-1 ;
                                int indice2=l<j ? l : l-1 ;
                                det[indice1][indice2]=matriz[k][l];
                            }
                        }
                    }
                }
                detValor=determinante2(det);
                nm[i][j]=detValor * (double)Math.pow(-1, i+j+2);
            }
        }

        //imprimir cofactres de la matriz

        System.out.println();
        
        System.out.println("Los cofactores de la matriz son:");

        for (int a = 0; a < nm.length; a++) {
            for (int b = 0; b < nm[a].length; b++) {
                System.out.print(nm[a][b] + " ");
            }
            System.out.println();
        }
        return nm;
    }


   /* public void printMatriz(double[][] mat) {
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            System.out.print(mat[i][j] + " ");
        }

        System.out.println();
    }
*/
  
}




