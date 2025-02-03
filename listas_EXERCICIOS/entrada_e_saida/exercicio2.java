package entrada_e_saida;
import java.math.*;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("bem vindo a calculadora ETS!");

        System.out.printf("digite o primeiro numero: ");
        num1 = sc.nextInt();
        sc.nextLine();

        System.out.printf("digite o segundo numero: ");
        num2 = sc.nextInt();
        sc.nextLine();


        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("%d / %d = %.2f\n", num1, num2, (float) num1 / num2);
        System.out.println(num1 + "^" + num2 + " = " + Math.pow(num1, num2));
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);


        sc.close();
    }
}
