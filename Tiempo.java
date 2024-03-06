package GuiaII;

public class Tiempo
{
    Algoritmos algoritmos = new Algoritmos();
    String[] metodos = new String[]{"Burbuja", "Seleccion", "Insercion", "Union"};
    
    public void prueba(int tamaño)
    {
        double[] datos = new double[tamaño];
        
        for (int i = 0; i < tamaño; i++) 
        {
           datos[i]=(Math.random()*100);
        }

        System.out.println("Datos a analizar: "+tamaño);
        
        double startTime = System.nanoTime();
        algoritmos.Burbuja(tamaño, datos);
        
        double endTime = System.nanoTime();
        double[] executionTime =new double[4];
        
        executionTime[0]= endTime - startTime;
        System.out.println("\tMetodo burbuja: " + executionTime[0]);
        startTime = System.nanoTime();
        algoritmos.seleccion(tamaño, datos);
        endTime = System.nanoTime();
        
        
        executionTime[1] = endTime - startTime;
        System.out.println("\tMetodo seleccion: " + executionTime[1]);
        startTime = System.nanoTime();
        algoritmos.insercion(tamaño, datos);
        endTime = System.nanoTime();
        
        
        executionTime[2] = endTime - startTime;     
        System.out.println("\tMetodo insercion: " + executionTime[2]);
        startTime = System.nanoTime();
        algoritmos.mergeSort(datos, 0, tamaño-1);
        endTime = System.nanoTime();
        executionTime[3] = endTime - startTime;
        
        
        System.out.println("\tMetodo union: " + executionTime[3]);
        Personas personas = new Personas();
        
        
        double[] copia = personas.copy(executionTime);
        algoritmos.Burbuja(4, copia);
        
        for (int i = 0; i < 4; i++) 
        {
            if(copia[0]==executionTime[i])
                System.out.println("El mejor tiempo fue: "+copia[0]+", del metodo: "+metodos[i]+"\n");
        }
        
        //imprimir(datos);
        
    }
    
    //void imprimir (double datos[])
            
    //{
        //for (int i = 0; i < datos.length; i++) 
        //{
         //   System.out.println(datos[i]);
       //   }
     //}
}