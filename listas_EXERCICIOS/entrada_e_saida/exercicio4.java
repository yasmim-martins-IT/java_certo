package entrada_e_saida;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int num,antecessor,sucessor;
        Scanner sc = new Scanner(System.in);

        System.out.printf("digite o numero : ");
        num = sc.nextInt();

        antecessor = num-1;
        sucessor = num+1;

        System.out.printf("o antecessor de %d é %d \n",num,antecessor);
        System.out.printf("o sucessor de %d é %d",num,sucessor);

        sc.close();
    }
}
