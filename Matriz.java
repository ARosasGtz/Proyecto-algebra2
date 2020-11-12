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
}
