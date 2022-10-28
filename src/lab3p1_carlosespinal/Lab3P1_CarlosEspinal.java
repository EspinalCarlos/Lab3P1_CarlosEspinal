
package lab3p1_carlosespinal;

import java.util.Scanner;

public class Lab3P1_CarlosEspinal {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("**Menu**");
            System.out.println();
            System.out.println("1. Diptongos");
            System.out.println("2. Sumatoria PI");
            System.out.println("3. Time Clock");
            System.out.println("4. Salida");
            System.out.println();
            System.out.println("Ingrese la opcion que desea utilizar: ");
            
            opcion = read.nextInt();
            
            switch (opcion) {
                case 1:
                    String palabra;
                   System.out.println("Se ha seleccionado la opcion 1");
                   System.out.println();
                   System.out.println("Ingrese una cadena: ");
                   palabra = read.next();
                   int cont = 0;
                   for (int i = 0; i < palabra.length(); i++) {
                       char letter = palabra.charAt(i);
                       switch (letter) {
                           case 'a','e','i','o','u' -> {
                               char letter2;
                               if ((i+1) != palabra.length()) {
                                   letter2 = palabra.charAt(i+1);
                               }
                               else {
                                   letter2 = 'l';
                               }
                               switch (letter2) {
                                   case 'a','e','i','o','u' -> {
                                       cont++;
                                   }//case lette 
                               }//switch letter2
                           }// case letter
                       }//fin switch letter
                   }//fin for case 1
                   if (cont > 0) {
                       System.out.println("La palabra es un diptongo");
                   }
                   else {
                       System.out.println("La palabra no es un diptongo");
                   }
                break;
                case 2:
                    double acum = 0;
                    System.out.println("Se ha seleccionado la opcion 2");
                    System.out.println();
                    System.out.println("Ingrese un limite para la sumatoria: ");
                    int limite = read.nextInt();
                    for (int n = 0; n < limite; n++) {
                        double x = Math.pow(-1,n);
                        double y = ((2*n)+1);
                        double eq = x / y ;
                        acum += eq;
                    }
                    double sumatoria = 4*acum;
                        System.out.println("El valor de la sumatoria es: "+ sumatoria);
                    
                break;
                case 3:
                    System.out.println("Se ha seleccionado la opcion 3");
                    System.out.println();
                    System.out.println("Ingrese un tamaño impar: ");
                    int size = read.nextInt();
                    for (int i = 0; i <= size/2; i++) {
                        for (int j=0;j < i; j++){
                            System.out.print(" ");
                        }
                        for (int o = 0; o < size - (2 * i); o++) {
                            System.out.print("*");
                        }
                        System.out.println();
                            
                    }
                    int m = (size/2)+1;
                    for (int i = 0; i < m; i++){
                        for (int j = 0;j < m - (i+1);j++) {
                            System.out.print(" ");
                        }
                        for (int o = 0; o<= i + i; o++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    
                break;
                default:
            }
        } while(opcion != 4);
    }
    
}
