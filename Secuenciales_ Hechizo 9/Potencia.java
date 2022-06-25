//Kennet Rodriguez
//Elevar un número a una potencia dada
import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) { 
        double numero=0, potencia=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número base: ");
        numero = leer.nextDouble();
        
        System.out.println("Ingrese la potencia: ");
        potencia = leer.nextDouble();
        
        potencia = potencia(numero,potencia);
        
        System.out.println("Resultado: " + potencia);
    }
    
    public static double potencia(double numero, double potencia){
        return Math.pow(numero, potencia);
        
    }
} 
