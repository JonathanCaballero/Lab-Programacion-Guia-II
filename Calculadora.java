package GuiaII;

public class Calculadora
{
    public int fila, columna, n;
    
    int[][] a=new int[100][100];
    int[][] b=new int[100][100];
    int[][] c=new int[100][100];
    
    public void suma()
    {
        for(int i = 0; i < fila; i++)
        {
            for(int j = 0; j < columna; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }
    
    public void resta()
    {
        for(int i = 0; i < fila; i++)
        {
            for(int j = 0; j < columna; j++)
            {
                c[i][j]=a[i][j] - b[i][j];
            }
        }
    }
    
    public void multiplicacion(int filaA, int columnaA, int filaB, int columnaB) 
    {
        if(columnaA == filaB)
        {
            int[][] C= new int[filaA][columnaB];
            
            for(int i = 0; i < filaA; i++)
            {
                for(int j = 0; j < columnaB; j++)
                {
                    int suma = 0;
                    
                    for(int k = 0; k < columnaA; k++)
                    {
                        suma += a[i][k] * b[k][j];
                    }
                    C[i][j] = suma;
                }
            }   
            this.c = C;
        } 
        else 
        {
        System.out.println("Matrices NO compatibles");
        }
    }
    
    public void producto(int filaA, int columnaA) 
    {
        int[][] C = new int[filaA][columnaA];
        
        for (int i = 0; i < filaA; i++) 
        {
            for (int j = 0; j < columnaA; j++) 
            {
                C[i][j] = n * a[i][j];
            }
        }
        
        this.c = C;
    }
    
    public void transpuesta()
    {
        for(int i = 0; i < fila; i++)
        {
            for(int j = 0; j < columna; j++)
            {
                b[j][i] = a[i][j];
            }
        }
    }
}

    