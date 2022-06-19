import java.util.Scanner;
public class Ventas {
    public static void main(String[] args) {
        double sueldo=0.0, venta1=0.0, venta2=0.0, venta3=0.0, sueldoTotal=0.0;
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el sueldo base");
        sueldo=leer.nextDouble();
        System.out.println("Ingrese el valor de la primera venta:");
        venta1=leer.nextDouble();
        System.out.println("Ingrese el valor de la segunda venta:");
        venta2=leer.nextDouble();
        System.out.println("Ingrese el valor de la tercera venta:");
        venta3=leer.nextDouble();
        sueldoTotal= Ventas.sueldoTotal(sueldo,venta1,venta2,venta3);
        System.out.println("El sueldo total es: "+ sueldoTotal);
    } 
    
    public static double sueldoTotal(double sueldo, double venta1, double venta2, double venta3){
        return (0.1*(venta1+venta2+venta3))+sueldo;
        
    }
} 
