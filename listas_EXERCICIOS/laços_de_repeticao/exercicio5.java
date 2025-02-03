package laços_de_repeticao;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_pessoas = 0 ;
        int saldo_negativo = 0 ;
        int saldo_positivo = 0 ;

        while (true) {
            System.out.printf("deseja informar seu saldo? (S/N) :");
            String escolha = sc.nextLine().toUpperCase();

            if (escolha.equals("S")){
                System.out.printf("digite seu saldo: ");
                double saldo = sc.nextDouble();
                sc.nextLine();
                if (saldo < 0) {
                    saldo_negativo++;
                }
                else {
                    saldo_positivo++;
                }
                total_pessoas++;

            }
            else {
                break;
            }
        }
        double porcentagem_positivo = (double) saldo_positivo / total_pessoas * 100;
        double porcentagem_negativo = (double) saldo_negativo / total_pessoas * 100;

        if (porcentagem_positivo >= 50) {
            System.out.printf("nenhum risco!");
        }
        else{
            System.out.printf("Risco ao banco");
        }

    }
}
