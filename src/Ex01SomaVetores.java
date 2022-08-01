
import java.util.Arrays;
import java.util.Scanner;

public class Ex01SomaVetores {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] num1 = new int[5];
        int[] num2 = new int[5];
        double[] num3 = new double[5];
        int opcao;

        for (int i = 0; i < num1.length; i++) {
            System.out.print("Digite um Array1 : ");
            num1[i] = read.nextInt();
        }
        for (int i = 0; i < num2.length; i++) {
            System.out.print("Digite um Array2: ");
            num2[i] = read.nextInt();
        }
        System.out.println("################################");
        System.out.println("1 - Soma.");
        System.out.println("2 - Subtração.");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("################################");
        opcao = read.nextInt();

        if (opcao == 1){
            for (int i = 0; i < num3.length; i++){
                num3[i] = num1[i] + num2[i];
            }

        }else if (opcao == 2){
            for (int i = 0; i < num3.length; i++){
                num3[i]  = num1[i] - num2[i];
            }
        } else if (opcao == 3) {
            for (int i = 0; i < num3.length; i++){
                num3[i]  = num1[i] * num2[i];
            }
        }else
            for (int i = 0; i < num3.length; i++){
                num3[i]  = num1[i] / num2[i];
            }
        System.out.println("A soma dos dos vetores é de: " + Arrays.toString(num3));
    }
}
