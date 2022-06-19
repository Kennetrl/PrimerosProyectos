//Calcular el nuevo salario de un obrero si obtuvo un incremento del porcentajeIncremento% sobre su salario anterior
import java.util.Scanner;
public class Incremento {
    public static void main(String[] args) { 
        double salario=0, porcentaje=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el salario: ");
        salario=leer.nextDouble();
        System.out.println("Ingrese el porcentaje de incremento: ");
        porcentaje=leer.nextDouble();
        System.out.println("El sueldo total es: " + incrementoSalario(salario,porcentaje));
    } 
    
     public static double incrementoSalario(double salario, double porcentajeIncremento){
        return salario * (1 + porcentajeIncremento);
        
    } 
} 
