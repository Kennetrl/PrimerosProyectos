//Convertir una distancia en metros a otra unidad de medida de longitud
import java.util.Scanner;
public class MedidaLongitud {
    public static void main(String[] args) { 
        double cantidad=0, unidad=0, longitud=0;
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad de metros: ");
        cantidad=leer.nextDouble();
        System.out.println("Ingrese la unidad de medida: ");
        unidad=leer.nextDouble();
        longitud=metrosAOtraMedida(cantidad, unidad);
        System.out.println("La equivalencia es: " + longitud);
    }
    
    public static double metrosAOtraMedida(double metros, double unidadMedida){
        return metros*unidadMedida;
        
    } 
} 
