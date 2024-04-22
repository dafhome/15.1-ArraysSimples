import java.util.Arrays;
import java.util.Scanner;

public class CopiaArrays {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Indicame cuantos números quieres en el listado:");
        int longitudArray = scan.nextInt();
        scan.nextLine();
        int numeros[] = new int[longitudArray];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) Math.ceil((Math.random() * 100));
        }    
        
        //Copia mediante Arrays.copyOf

        int numerosCopia[] = Arrays.copyOf(numeros, numeros.length);

        //Copia mediante bucle for

        int numerosCopia2[] = new int[numeros.length];

        for (int i = 0; i<numeros.length;i++){
            numerosCopia2[i] = numeros[i];
        }

        System.out.println("Array numeros con direccion memoria:"+numeros);

        for (int i : numeros) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Array numerosCopia con direccion memoria:"+numerosCopia);
    
        for (int i : numerosCopia) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Array numerosCopia2 con direccion memoria:"+numerosCopia2);
    
        for (int i : numerosCopia2) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
    
    
        scan.close();
    }

    
}
