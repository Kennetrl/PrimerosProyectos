//Calcular el peso dado en kilos de una persona en gramos, libras y toneladas.
import java.util.Scanner;
public class Peso {
    public static void main(String[] args) { 
        double kilos=0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese numero de kilos: ");
        kilos=leer.nextDouble();
        System.out.println("Gramos: " + kilosAGramos(kilos)+" Libras: "+ kilosALibras(kilos)+" Toneladas: "+ kilosAToneladas(kilos));
    } 
    
    public static double kilosAGramos(double kilos){
        return kilos*1000;
        
    }
    
    public static double kilosALibras(double kilos){
        return kilos*2.20462262;
        
    }
    
    public static double kilosAToneladas(double kilos){
        return kilos/1000;
        
    }
} 