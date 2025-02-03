package entrada_e_saida;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mes = "";
        double salario_fixo = 1500.00;



        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o mês \n 1-janeiro \n 2-fevereiro \n 3-março \n 4-abril \n 5-maio \n 6-junho \n 7-julho \n 8- agosto \n 9-setembro \n 10-outubro \n 11-novembro \n 12-dezembro");

        byte escolha = sc.nextByte();

        switch (escolha){
            case 1 :
                mes = "Janeiro";
                break;
            case 2:
                 mes ="'Fevereiro";
                 break;
            case 3 :
                mes ="março";
                break;
            case 4 :
                mes = "abril";
                break;
            case 5:
                mes = "maio";
                break;
            case 6 :
                mes = "junho";
                break;
            case 7 :
                mes = "julho";
                break;
            case 8:
                mes = "agosto";
                break;
            case 9:
                mes = "setembro";
                break;
            case 10:
                mes = "outubro";
                break;
            case 11:
                mes = "novembro";
                break;
            case 12:
                 mes = "dezembro";
                 break;
            default:
                System.out.println("numero invaldo");
                return ;

        }
        System.out.println("digite o numero de carros vendidos no mês de "+mes);
        int carros_vendidos = sc.nextInt();

        System.out.println("digite o valor total das vendas do mês de "+mes);
        double vendas_mes = sc.nextDouble();

        double comicao = carros_vendidos *350.00;

        double porcentagem_vendas = vendas_mes *  0.0001 ;

        double salario_mes = salario_fixo + comicao + porcentagem_vendas ;

        System.out.println("o salario do mes do vendedor(A)"+ nome+ "é : R$" +salario_mes);

        sc.close();
    }
}
