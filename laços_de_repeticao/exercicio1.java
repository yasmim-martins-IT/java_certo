package laços_de_repeticao;
import java.util.ArrayList;

import java.lang.reflect.Array;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0 ;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int numeros ;

        while (contador <10){
            System.out.printf("digite o numero:");
            numeros = sc.nextInt();
            sc.nextLine();
            lista.add(numeros);

            contador++;

        }
        System.out.printf("Escolha oque deseja saber: \n 1-Quantos números pares: \n 2-quantos numeros impares? \n 3-quantos negativos \n 4-quantos positivos \n digite aqui:");
        int escolha = sc.nextInt();
        sc.nextLine();
        switch (escolha){
            case(1) :
                int quantidade_pares = 0 ;
                for (int i = 0 ; i < lista.size();i++ ){
                    int num = lista.get(i);
                    if (num % 2 == 0){
                        quantidade_pares++;
                    }
                }
                System.out.println("A quantidade de numeros pares é : "+ quantidade_pares);
                break;
            case (2) :
                int quantidade_impares = 0;
                for (int i = 0; i < lista.size();i++){
                    int num = lista.get(i);
                    if (num % 2 != 0) {
                        quantidade_impares++;
                    }
                }
                System.out.println("A quantidade de numeros impares é : "+ quantidade_impares);
                break;
            case (3) :
                int numeros_negativos = 0;

                for (int i = 0 ; i <lista.size();i++ ){
                    int num =  lista.get(i);
                    if (num < 0 ){
                        numeros_negativos++;
                    }
                }
                System.out.println("A quantidade de numeros negativos é : "+ numeros_negativos);
                break;
            case (4) :
                int numeros_posetivos = 0;
                for (int i = 0 ; i < lista.size();i++){
                    int num = lista.get(i);
                    if (num >= 0 ){
                        numeros_posetivos++;
                    }
                }
                break ;
            }

    }
}
