import java.util.Scanner;

public class ArrayLongitudUsuario {
    public static void main(String[] args) throws Exception {
        // 1 - Crear un array de lo que desees, pero con el tamaño que diga el usuario. Luego añadir elementos hasta que se rellene. Luego mostrarlo.
        Scanner scan = new Scanner(System.in);
        System.out.println("Indicame cuantos elementos quieres introducir en tu lista de mascotas");
        int mascotas = scan.nextInt();

        scan.nextLine();

        String tipoMascotas [] = new String [mascotas];

        System.out.println("Ahora te iré preguntando tipos de mascota hasta que me indique tantas como el número indicado");
        
        for (int i = 0; i<mascotas; i++){
            System.out.println("Indicame el tipo mascota "+(i+1)+":");
            tipoMascotas [i] = scan.nextLine().toLowerCase();   
        }
        scan.close();
        System.out.println("Las mascotas que has introducido son:");
        for (String mascota : tipoMascotas) {
            System.out.print(mascota+" ");
        }
        System.out.println(" ");
        scan.close();
    }
}
