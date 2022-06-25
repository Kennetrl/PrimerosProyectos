//Kennet Rodriguez
//Dada una cantidad de monedas, obtener la equivalencia en dólares, asumiendo que la unidad cambiaria es un dato desconocido.
import java.util.Scanner;
public class CambioMoneda {
    public static void main(String[] args) { 
        double cantidad=0, unidad=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de monedas: ");
        cantidad=leer.nextDouble();
        System.out.println("Ingrese la unidad cambiaria: ");
        unidad=leer.nextDouble();
        System.out.println("La equivalencia es: " + CambioMoneda.cambioMoneda(cantidad, unidad));
    } 
    
    public static double cambioMoneda(double cantidad, double unidadCambiaria){
        return cantidad/unidadCambiaria;
        
    } 
} 
