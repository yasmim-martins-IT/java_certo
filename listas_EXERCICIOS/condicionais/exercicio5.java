package condicionais;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int quantidade_atual ;
        int quantidade_max ;
        int quantidade_min ;

        System.out.printf("digite a quantidade atual do produto em estoque: ");
        quantidade_atual = sc.nextInt();
        sc.nextLine();

        System.out.printf("digite a quantidade maximo do produto em estoque: ");
        quantidade_max = sc.nextInt();
        sc.nextLine();

        System.out.printf("digite a quantidade minima do produto em estoque: ");
        quantidade_min = sc.nextInt();
        sc.nextLine();

        int quantidade_media = (quantidade_max+quantidade_min)/2;

        if (quantidade_atual >= quantidade_media){
            System.out.printf("Não efetuar a compra");
        }
        else {
            System.out.printf("Efetuar compra");
        }
    }
}
