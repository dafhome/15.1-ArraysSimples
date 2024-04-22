public class ArrayParesImpares {
    public static void main(String[] args) throws Exception {
        // 2 - Tienes un array de 20 números enteros: decir cuales son pares e impares.
        // +EXTRA: irlos añadiendo a nuevos arrays: 'arrayPares' y 'arrayImpares', y al
        // final mostrar los tres arrays.

        int numeros[] = new int[20];
        int numerosPares[] = new int[20];
        int numerosImpares[] = new int[20];
        int indexPares = 0;
        int indexImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) Math.ceil((Math.random() * 100));
        }
        // System.out.println(numeros[0]);
        for (int num : numeros) {
            // System.out.print(i+" ");

            if (num % 2 == 0) {
                numerosPares[indexPares] = num;
                indexPares++;
            } else {
                numerosImpares[indexImpares] = num;
                indexImpares++;
            }
        }
        // System.out.println(" ");
        System.out.println("Tienes " + indexPares + " números pares y son:");
        // for (int pares : numerosPares) {
        // System.out.print(pares+" ");
        // }
        for (int i = 0; i < indexPares; i++) {
            System.out.print(numerosPares[i] + " ");
        }

        System.out.println();
        System.out.println("Tienes " + indexImpares + " números impares y son:");
        // for (int impares : numerosImpares) {
        // System.out.print(impares+" ");
        // }
        for (int i = 0; i < indexImpares; i++) {
            System.out.print(numerosImpares[i] + " ");

        }
        System.out.println(" ");

    }
}
