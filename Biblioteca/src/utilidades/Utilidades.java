
package utilidades;

/**
 * Utilidades varias
 * 
 * @author 03_1DAW, 07_1DAW
 * @version 0.1
 */

public class Utilidades {
    
    public static boolean esPrimo(int numero) {
        
        /**
         * Metodo que nos devuelve si es primo o no el numero
         * 
         * @param numero numero introducido
         */
        
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
    
    public static int calcularFactorial(int numero) {
        
        /**
         * Metodo que nos calcula el factorial del numero dado
         * 
         * @param numero numero introducido
         */
        
        // Variables
        int factorial = 1;
        
        for (int i=1; i <= numero; i++) {
            
            factorial *= i;
            
        }
        
        return factorial;
        
    }
    
    public static double multiplicarTresNumeros(int num1, int num2, int num3) {
        
        /**
         * Metodo para calcular la multiplicacion de tres numeros
         * 
         * @param num1 numero 1 introducido
         * @param num2 numero 2 introducido
         * @param num3 numero 3 introducido
         */
        
        //Variables
        double resultado;
        
        resultado = num1 * num2 * num3;
        
        return resultado;
        
    }
    
    public static double calcularAleatorio (int minimo, int maximo) {
        
        /**
         * Metodo que devuelve un numero aleatorio de un rango dado
         * 
         * @param minimo rango minimo introducido
         * @param maximo rango maximo introducido
         */
        
        //Variables
        double numAleatorio;
        
        numAleatorio = (Math.random() * (maximo - minimo)) + minimo;
        
        return numAleatorio;
        
    }
    
    public static double calcularGrande (double num1, double num2) {
        
        /**
         * Metodo que nos devuelve el numero mayor
         * 
         * @param num1 numero 1 introducido
         * @param num2 numero 2 introducido
         */
        
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
    
    public static double calcularAreaRectangulo(double base, double altura) {
        
        /**
         * Metodo que nos devuelve el area de un rectangulo
         * 
         * @param base base del rectangulo introducida
         * @param altura altura del rectangulo introducida
         */
        
        //Variables
        double area;
        
        area = base * altura;
        
        return area;
        
    }
    
    public static double calcularDivision (double num1, double num2){
        
        /**
         * Metodo que nos devuelve la division de numero 1 entre numero 2
         * 
         * @param num1 numero 1 introducido
         * @param num2 numero 2 introducido
         */
        
        //Variable
        double division;
        
        division = num1 / num2;
        
        return division;
        
    }
    
}
