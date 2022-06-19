//Una tienda ofrece un descuento del porcentajeDescuento% sobre el total de la compra y un cliente desea saber cuánto deberá pagar finalmente por su compra.
import java.util.Scanner;
public class Descuento {
    public static void main(String[] args) { 
        double venta=0, valorDescuento=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de venta: ");
        venta=leer.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento: ");
        valorDescuento=leer.nextDouble();
        System.out.println("La venta total es: " + descuento(venta,valorDescuento));
    }
    
    public static double descuento(double venta, double valorDescuento) {
        return venta *(1 - (valorDescuento/100));
        
    } 
} 
