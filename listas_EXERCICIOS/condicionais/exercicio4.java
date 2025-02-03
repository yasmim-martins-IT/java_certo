package condicionais;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double valor_base = 3000;
        double valor_total ;

        System.out.printf("Digite aonde você deseja passar as férias: \n 1-maceió  \n 2-porto de galinhas \n digite aqui:");
        byte destino_ferias = sc.nextByte();
        sc.nextLine();

        System.out.printf("Deseja almoço/janta inclusos?(S/N) : ");
        String escolha = sc.next().toUpperCase();

        if (destino_ferias == 1 &&  escolha == "S"){
            valor_total = valor_base;

            System.out.println("valor total da viagem é : R$"+valor_total);
        }
        else if (destino_ferias == 1 && escolha.equals("N")){
            valor_total = (valor_base*85)/100;
            System.out.println("valor total da viagem é : R$"+valor_total);
        }
        else if (destino_ferias == 2 && escolha.equals("S")){
            valor_total = (valor_base*60)/100;
            System.out.println("valor total da viagem é : R$"+valor_total);
        }
        else if (destino_ferias == 2 && escolha.equals("N")){
            valor_total = (valor_base*45)/100;
            System.out.println("valor total da viagem é : R$"+valor_total);
        }



    }
}
