package condicionais;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("digite o  valor unitario do produto: ");
        double valor_unitario = sc.nextDouble();

        System.out.printf("digite a quantidade do produto: ");
        int quantidade = sc.nextInt();

        if (quantidade > 12){
            double valor_total = valor_unitario * quantidade;
            double valor_com_desconto = (valor_total *10) /100;

            System.out.printf("o valor total da compra é R$%.2f",valor_com_desconto);

        }
        if (quantidade <12 && quantidade > 0){
            double valor_total = valor_unitario * quantidade;

            System.out.printf("o valor total da compra é R$%.2f ",valor_total);
        }

        sc.close();
    }

}
