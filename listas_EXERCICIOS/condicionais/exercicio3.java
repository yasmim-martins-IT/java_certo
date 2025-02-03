package condicionais;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("digite a quantidade gols feitos pelo timeA nessa partida: ");
        byte gols_timeA = sc.nextByte();

        System.out.printf("digite a quantidade de gols feitos pelo timaB nessa partida: ");
        byte gols_timeB = sc.nextByte();

        if (gols_timeA >= gols_timeB){
            System.out.printf("resultado do jogo : %d x %d",gols_timeA,gols_timeB);
            System.out.println("\nO time A ganhou!!!");
        }
        if (gols_timeB >= gols_timeA){
            System.out.printf("resultado do jogo : %d x %d",gols_timeB,gols_timeA);
            System.out.println("\nO time B ganhou");
        }
        sc.close();
    }
}
