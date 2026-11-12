
package utilidades;

/**
 * Utilidades varias
 * 
 * @author 03_1DAW, 07_1DAW
 * @version 0.1
 */

public class Utilidades {
    
    /**
         * Metodo que nos devuelve si es primo o no el numero
         * 
         * @param numero numero introducido
         */
    public static boolean esPrimo(int numero) {
        
        // Variables
        boolean esPrimo = true;
        
        for (int i = 1; i <= numero; i++) {

                // Condicion que me dice que no es primo (Distinto de 1 y de si mismo, y divisible entre otro numero)
                if (i != 1 && i != numero && numero % i == 0) {

                    esPrimo = false;

                }

        }
        
        return esPrimo;
        
    }
    
    /**
         * Metodo que nos calcula el factorial del numero dado
         * 
         * @param numero numero introducido
         */
    public static int calcularFactorial(int numero) {
        
        // Variables
        int factorial = 1;
        
        for (int i=1; i <= numero; i++) {
            
            factorial *= i;
            
        }
        
        return factorial;
        
    }
    
    /**
         * Metodo para calcular la multiplicacion de tres numeros
         * 
         * @param num1 numero 1 introducido
         * @param num2 numero 2 introducido
         * @param num3 numero 3 introducido
         */
    public static double multiplicarTresNumeros(int num1, int num2, int num3) {
        
        //Variables
        double resultado;
        
        resultado = num1 * num2 * num3;
        
        return resultado;
        
    }
    
    /**
         * Metodo que devuelve un numero aleatorio de un rango dado
         * 
         * @param minimo rango minimo introducido
         * @param maximo rango maximo introducido
         */
    public static double calcularAleatorio (int minimo, int maximo) {
        
        //Variables
        double numAleatorio;
        
        numAleatorio = (Math.random() * (maximo - minimo)) + minimo;
        
        return numAleatorio;
        
    }
    
    /**
         * Metodo que nos devuelve el numero mayor
         * 
         * @param num1 numero 1 introducido
         * @param num2 numero 2 introducido
         */
    public static double calcularGrande (double num1, double num2) {
        
        // Variables
        double mayor;
        
        if(num1 > num2) {
            
            mayor = num1;
            
        } else if (num1 == num2) {
            
            mayor = num1;
            
            System.out.println("Son iguales");
            
        } else {
            
            mayor = num2;
            
        }
        
        return mayor;
        
    }
    
    /**
         * Metodo que nos devuelve el area de un rectangulo
         * 
         * @param base base del rectangulo introducida
         * @param altura altura del rectangulo introducida
         */
    public static double calcularAreaRectangulo(double base, double altura) {
        
        //Variables
        double area;
        
        area = base * altura;
        
        return area;
        
    }
    
    /**
         * Metodo que nos devuelve la division de numero 1 entre numero 2
         * 
         * @param num1 numero 1 introducido
         * @param num2 numero 2 introducido
         */
    public static double calcularDivision (double num1, double num2){
          
        //Variable
        double division;
        
        // No se puede dividir entre 0
        if(num2 == 0) return 0;
        
        division = num1 / num2;
        
        return division;
        
    }
    
    public static void mostrarArray(int[] numeros){
        
        for (int i=0; i<numeros.length; i++) {
            
            System.out.println(numeros[i]);
            
        }
        
    }
    
    public static void mostrarArrayLado(int[] numeros){
        
        for (int i=0; i<numeros.length; i++) {
            
            System.out.print(numeros[i] + " ");
            
        }
        
    }
    
}
