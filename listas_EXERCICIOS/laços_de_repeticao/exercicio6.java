package laços_de_repeticao;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("digite o numero que deseja saber a tabuada : ");
        int num_tabuada = sc.nextInt();

        for (int i= 0 ; i <=10 ; i++){
            System.out.printf("%d x %d = %d \n",num_tabuada,i,num_tabuada*i);
        }
    }
}
