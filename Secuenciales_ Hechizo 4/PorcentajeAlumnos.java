//Un maestro desea saber qué porcentaje de hombres y que porcentaje de mujeres hay en un grupo de estudiantes.
import java.util.Scanner;
public class PorcentajeAlumnos {
    public static void main(String[] args) { 
        int hombres=0, mujeres=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de mujeres: ");
        mujeres=leer.nextInt();
        System.out.println("Ingrese la cantidad de hombres: ");
        hombres=leer.nextInt();
        System.out.println("El porcentaje de mujeres es: " + porcentajeMujeres(hombres,mujeres)+"% y de hombres es: "+porcentajeHombres(hombres,mujeres)+"%");
    } 
    
    public static double porcentajeHombres(double hombres,double mujeres){
        return Math.round((hombres*100)/(hombres+mujeres));
        
    }
    
    public static double porcentajeMujeres(double hombres,double mujeres){
        return Math.round((mujeres*100)/(hombres+mujeres));
        
    }
} 
