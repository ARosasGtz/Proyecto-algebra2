import java.util.Scanner;

class Main{
  public static void main(String[] args){
	  Scanner inp = new Scanner(System.in);
	  
    int matriz [][], filas, columnas;
		
    Autores();

    System.out.println("Ingrese el numero de filas: ");
	  filas = inp.nextInt();
		
    System.out.println("Ingrese el numero de columnas: ");
	  columnas = inp.nextInt();
		  
	  matriz = new int [filas] [columnas];
    Matriz m1 = new Matriz(filas,columnas,matriz);
    
    m1.Datos();
    System.out.println();
    m1.imprimirMatriz();
  }

  public static void Autores(){
    System.out.println("\nAutores: \nMonserrat Bautista \nÁngel Isaid Martinez \nÁngel Jair Rosas \nChristian Sanchez.\n");
  }
}