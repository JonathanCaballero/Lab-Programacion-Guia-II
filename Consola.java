package GuiaII;
import java.util.Scanner;
public class Consola {

    public static int fi, co;

    @SuppressWarnings("empty-statement")
    
    public static void main(String[] args) 
    {
        Scanner ingreso = new Scanner(System.in);
        Calculadora cal1 = new Calculadora();
        char op, op2;
        
        do 
        {
            System.out.println("\n\t-MENU-\n1. Calculadora de matrices.\n2. Prueba de algoritmos.\n3. Datos de personas.\n4. Salir. \n");
            op2 = ingreso.next().charAt(0);
            ingreso.nextLine();
            
            switch (op2) 
            {
                case '1' -> 
                {
                    System.out.println("\t-CALCULADORA DE MATRICES- \n1. Suma. \n2. Producto. \n3. Producto escalar. \n4. transpuestas. \n5. Salir. \n");
                    op = ingreso.next().charAt(0);
                    ingreso.nextLine();
                    
                    switch (op) 
                    {
                        case '1' -> 
                        {
                            System.out.println("Numero de Filas y Columnas de las matrices: ");
                            cal1.fila = ingreso.nextInt();
                            fi = cal1.fila;
                            
                            cal1.columna = ingreso.nextInt();
                            co = cal1.columna;
                            System.out.println("Escriba los numeros de las filas de la matriz 1 en orden");
                            
                            for (int i = 0; i < fi; i++) 
                            {
                                for (int j = 0; j < co; j++) 
                                {
                                    System.out.println("Ingrese el numero: ");
                                    cal1.a[i][j] = ingreso.nextInt();
                                }

                            }
                            
                            System.out.println("Escriba los numeros de las filas de la matriz 2 en orden");
                            
                            for (int i = 0; i < fi; i++) 
                            {
                                for (int j = 0; j < co; j++) 
                                {
                                    System.out.println("Ingrese el numero: ");
                                    cal1.b[i][j] = ingreso.nextInt();
                                }
                            }
                            
                            cal1.suma();
                            System.out.println("Matriz resultante: ");
                            System.out.print(" ");
                            
                            for (int j = 0; j < co; j++) 
                            {
                                System.out.print("----");
                            }
                            
                            System.out.println("-");
                            for (int i = 0; i < fi; i++) 
                            {
                                System.out.print("|");
                                for (int j = 0; j < co; j++) 
                                {
                                    System.out.print(String.format(" %3d", cal1.c[i][j]));
                                }
                                
                                System.out.println(" |");
                            }
                            System.out.print(" ");
                            
                            for (int j = 0; j < co; j++) 
                            {
                                System.out.print("----");
                            }
                            System.out.println("-");
                        }
                        
                        case '2' -> 
                        {
                            System.out.println("Numero de Filas y Columnas de las matrices: ");
                            cal1.fila = ingreso.nextInt();
                            fi = cal1.fila;
                            cal1.columna = ingreso.nextInt();
                            co = cal1.columna;
                            System.out.println("Escriba los numeros de las filas de la matriz 1 en orden");
                            
                            for (int i = 0; i < fi; i++) 
                            {
                                for (int j = 0; j < co; j++) 
                                {
                                    System.out.println("Ingrese el numero: ");
                                    cal1.a[i][j] = ingreso.nextInt();
                                }

                            }
                            
                            System.out.println("Escriba los numeros de las filas de la matriz 2 en orden");
                            for (int i = 0; i < fi; i++) 
                            {
                                for (int j = 0; j < co; j++) 
                                {
                                    System.out.println("Ingrese el numero: ");
                                    cal1.b[i][j] = ingreso.nextInt();
                                }
                            }
                            
                            cal1.multiplicacion(fi, co, fi, co);
                            System.out.println("Matriz resultante: ");
                            System.out.print(" ");
                            
                            for (int j = 0; j < co; j++) 
                            {
                                System.out.print("----");
                            }
                            
                            System.out.println("-");
                            for (int i = 0; i < fi; i++) 
                            {
                                System.out.print("|");
                                for (int j = 0; j < co; j++) 
                                {
                                    System.out.print(String.format(" %3d", cal1.c[i][j]));
                                }
                                
                                System.out.println(" |");
                            }
                            System.out.print(" ");
                            
                            for (int j = 0; j < co; j++) 
                            {
                                System.out.print("----");
                            }
                            
                            System.out.println("-");
                        }
                        
                        case '3' -> 
                        {
                            System.out.println("Numero de Filas y Columnas de las matriz: ");
                            cal1.fila = ingreso.nextInt();
                            fi = cal1.fila;
                            cal1.columna = ingreso.nextInt();
                            co = cal1.columna;
                            System.out.println("Escriba los numeros de las filas de la matriz en orden");
                            
                            for (int i = 0; i < fi; i++) 
                            {
                                for (int j = 0; j < co; j++) 
                                {
                                    System.out.println("Ingrese el numero: ");
                                    cal1.a[i][j] = ingreso.nextInt();
                                }
                            }
                            
                            System.out.println("Escriba el numero por el que se va a multiplicar: ");
                            cal1.n = ingreso.nextInt();
                            cal1.producto(fi, co);
                            System.out.println("Matriz resultante: ");
                            System.out.print(" ");
                            
                            for (int j = 0; j < co; j++) 
                            {
                                System.out.print("----");
                            }
                            
                            System.out.println("-");
                            for (int i = 0; i < fi; i++) 
                            {                             
                                System.out.print("|");
                                
                                for (int j = 0; j < co; j++) 
                                {
                                    System.out.print(String.format(" %3d", cal1.c[i][j]));
                                }
                                
                                System.out.println(" |");
                            }
                            System.out.print(" ");
                            
                            for (int j = 0; j < co; j++) 
                            {
                                System.out.print("----");
                            }
                            System.out.println("-");
                        }
                        
                        case '4' -> 
                        {
                            System.out.println("Numero de Filas y Columnas de las matriz");
                            cal1.fila = ingreso.nextInt();
                            fi = cal1.fila;
                            cal1.columna = ingreso.nextInt();
                            co = cal1.columna;
                            System.out.println("Escriba los numeros de las filas de la matriz en orden");
                            
                            for (int i = 0; i < fi; i++) 
                            {
                                for (int j = 0; j < co; j++) 
                                {
                                    System.out.println("Ingrese el numero ");
                                    cal1.a[i][j] = ingreso.nextInt();
                                }
                            }
                            
                            cal1.transpuesta();
                            System.out.println("Matriz resultante: ");
                            System.out.print(" ");
                            
                            for (int j = 0; j < co; j++) 
                            {
                                System.out.print("----");
                            }
                            
                            System.out.println("-");
                            
                            for (int i = 0; i < fi; i++) 
                            {
                                System.out.print("|");
                                for (int j = 0; j < co; j++) 
                                     
                                {
                                    System.out.print(String.format(" %3d", cal1.b[i][j]));
                                }
                                
                                System.out.println(" |");
                            }
                            
                            System.out.print(" ");
                            
                            for (int j = 0; j < co; j++) 
                            {
                                System.out.print("----");
                            }
                            System.out.println("-");
                        }
                    }
                }
                
                case '2' ->
                {
                    Tiempo PruebaAlgoritmos = new Tiempo();

                      PruebaAlgoritmos.prueba(100);
                      PruebaAlgoritmos.prueba(500);
                      PruebaAlgoritmos.prueba(1000);
                      PruebaAlgoritmos.prueba(5000);
                      PruebaAlgoritmos.prueba(10000);
                }
                
                case '3' ->
                {
                    Personas personas = new Personas();
                    personas.setVisible(true);
                }
            }          
        } 
        
        while (op2 != '4');
    }
}
