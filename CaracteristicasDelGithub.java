/*
 * Implemente un algoritmo que le permita solicitar varias caracteristicas
sobre el software GitHub
 */
package caracteristicasdelgithub;

/**
 *
 * @author Alex
 */
import java.util.Scanner;
public class CaracteristicasDelGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner (System.in);
        System.out.println("Ingrese las caracteristicas de Github\n");
        System.out.println("Ingrese la caracteristica 1:");
        String caracteristica1=objeto.nextLine();
        
        System.out.println("Ingrese la caracteristica 2:");
        String caracteristica2=objeto.nextLine();
        
        System.out.println("Ingrese la caracteristica 3:");
        String caracteristica3=objeto.nextLine();
        
        System.out.println("Ingrese la caracteristica 4:");
        String caracteristica4=objeto.nextLine();
        
        System.out.println("Ingrese la caracteristica 5:");
        String caracteristica5=objeto.nextLine();
        

    }
    
}
