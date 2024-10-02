import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de terminos que desea en la serie de Fibonacci: ");
        int nTerminos = scanner.nextInt();
        System.out.print("Ingrese hasta que numero quiere que llegue la serie: ");
        int nMax = scanner.nextInt();
        scanner.close();

        long[] serieDeFibonacci = new long[nTerminos];
        serieDeFibonacci[0] = 0;
        if (nTerminos > 1) {
            serieDeFibonacci[1] = 1;

            for (int i = 2; i < nTerminos; i++) {
                serieDeFibonacci[i] = serieDeFibonacci[i - 1] + serieDeFibonacci[i - 2];
            }
        }

        System.out.println("Los primeros " + nTerminos + " terminos de la serie de Fibonacci son:");
        for (int i = 0; i < nTerminos; i++) {
            System.out.println(serieDeFibonacci[i] + " ");
        }

       long primerT = 0, segundotT= 1;
        System.out.println("La serie tiene estos números hasta el " + nMax + ":");
         while(primerT <= nMax){
            System.out.println(primerT + " ");
            long suma = primerT+segundotT;
             primerT=segundotT;
             segundotT= suma;
         }



    }
}