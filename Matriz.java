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

  public void dosPrimerasFilas(){
    int matAux[][] = new int[2][columnas];

    for(int x=0; x < 2; x++){
      for(int y=0; y < columnas; y++){
        matAux[x][y] += matriz[x][y];
        System.out.print(matAux[x][y] + " ");
      }
      System.out.println("\n");
    }
  }
  public double determinante2(int[][] matriz)
  {
    double det;

    if(matriz.length==2)
    {
        det=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
        return det;
    }

    double suma=0;

    for(int i=0; i<matriz.length; i++){

    int [][] nm=new int [matriz.length-1][matriz.length-1];

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

        if(i%2==0)
        suma+=matriz[i][0] * determinante2(nm);
        else
        suma-=matriz[i][0] * determinante2(nm);
    }
    return suma;
  }
}


  
