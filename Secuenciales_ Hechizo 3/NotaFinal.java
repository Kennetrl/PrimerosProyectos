//Kennet Rodriguez
//Un alumno desea saber cuál será su calificación final en la materia de Programación. Dicha calificación se compone de tres exámenes parciales.
import java.util.Scanner;
public class NotaFinal {
    public static void main(String[] args) { 
        double nota1=0, nota2=0, nota3=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Nota 1: ");
        nota1=leer.nextDouble();
        System.out.println("Ingrese la Nota 2: ");
        nota2=leer.nextDouble();
        System.out.println("Ingrese la Nota 3 ");
        nota3=leer.nextDouble();
        System.out.println("La nota final es: "+NotaFinal.notaFinal(nota1, nota2, nota3));
    }
    
    public static double notaFinal(double nota1,double nota2,double nota3){
        return nota1 + nota2 + nota3 ;
        
    }
} 
