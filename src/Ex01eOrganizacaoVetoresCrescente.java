import java.util.Arrays;
import java.util.Scanner;

public class Ex01eOrganizacaoVetoresCrescente {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] numeros = new int[10];
         int aux;


         for (int i = 0; i < numeros.length; i++){
             System.out.print("Digite um numero: ");
             numeros[i] = read.nextInt();
         }
         for (int i = 0; i < numeros.length; i++) {
             for (int j = 0; j < numeros.length; j++)
                 if (numeros[j] > numeros[i]) {
                     aux = numeros[i];
                     numeros[i] = numeros[j];
                     numeros[j] = aux;

                 }
         }
        System.out.println("Os numeros em Ordem Crescente são: " + Arrays.toString(numeros));
    }
}
