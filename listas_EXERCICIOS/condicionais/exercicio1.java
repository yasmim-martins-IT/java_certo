package condicionais;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("insira sua idade: ");
        int idade = sc.nextInt();

        if (idade <=14) {
            System.out.println("você é uma criança");
        }
        else if (idade > 14 && idade <= 17){
            System.out.println("você é um adolescente");
        }
        else if (idade > 17 && idade <=30){
            System.out.println("você é um jovem adulto");
        }
        else if (idade > 30){
            System.out.println("você é um adulto");
        }
        else {
            System.out.println("idade invalida");
        }
        sc.close();
    }
}
