import java.util.Scanner;

public class ArrayVacacionesIbiza {
    public static void main(String[] args) throws Exception {
        // 3- Premio vacaciones en Ibiza: tienes un listado de nombres en un array. Aleatoriamente, seleccionar el ganador y mostrarlo. Entonces preguntar: "otra vez? (S/N)", y si es que sí, volver a generar nuevo ganador y mostrarlo. Seguir preguntando hasta que el usuario diga que no.

        String[] nombres = {"Juan", "Maria", "Carlos", "Ana", "Pedro","Laura", "Luis", "Sofia", "Javier", "Lucía","Diego", "Elena", "Miguel","Carmen","Jose","Isabel", "Daniel", "Marta", "Pablo", "Lorena"};
        
        // int ganador = (int) Math.floor((Math.random()*20)+1);
        String pregunta;
        boolean validar = false;
        boolean validar2 = false;
        Scanner scan = new Scanner(System.in);
        int ganador;
        while (!validar) {
            ganador = (int) Math.floor((Math.random()*20));
            validar2=false;
            System.out.println("El ganador es "+nombres[ganador]);
            System.out.println("-----------------------------------------------------------");

            while (!validar2) {
                System.out.println("Otra vez? S/N");
                pregunta = scan.nextLine();
                if ("N".equalsIgnoreCase(pregunta)||"NO".equalsIgnoreCase(pregunta)) {
                    validar = true;
                    validar2 = true;
                }
                else if ("S".equalsIgnoreCase(pregunta)||"SI".equalsIgnoreCase(pregunta)) {
                    validar2 = true;
                }
                else{
                    System.out.println("Recuerda responder S/N");
                }
            }
            
        }




    }
}
