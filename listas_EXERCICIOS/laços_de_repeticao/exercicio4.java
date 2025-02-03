package laços_de_repeticao;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("digite o numero : ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.printf("digite um incremento : ");
        int incremento = sc.nextInt();
        int num_atual = 0;

        while (true){
            System.out.printf("%d, ",num_atual);

            if (num_atual == numero) {
                break;
            }
            else {
                num_atual += incremento;
            }
        }
    }
}
