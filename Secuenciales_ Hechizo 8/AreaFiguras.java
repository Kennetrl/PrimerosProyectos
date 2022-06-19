//Calcular el área de un cuadrado, triángulo y círculo.
import java.util.Scanner;
public class AreaFiguras {
    public static void main(String[] args) { 
        double lado=0, base=0, altura=0, radio=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        lado = leer.nextDouble();
        
        System.out.println("Ingrese la base del triángulo: ");
        base = leer.nextDouble();
        
        System.out.println("Ingrese la altura del triángulo: ");
        altura = leer.nextDouble();
        
        System.out.println("Ingrese el radio del círculo: ");
        radio = leer.nextDouble();
        
        System.out.println("Area cuadrado: " + AreaFiguras.areaCuadrado(lado)+" Area triangulo: "+ AreaFiguras.areaTriangulo(base,altura)+" Area circulo: "+AreaFiguras.areaCirculo(radio));
    } 
    
    public static double areaCuadrado(double lado){
        return lado * lado;
        
    }
    
    public static double areaTriangulo(double base, double altura){
        return (base*altura)/2;
        
    }
    
    public static double areaCirculo(double radio){
        return Math.PI * Math.pow(radio, 2);
        
    }
} 
