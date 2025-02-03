package entrada_e_saida;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        String nome, sobrenome, cnh=  " ",grau_instrucao = " ";
        int dia,mes,ano,escolha_usuario, idade,verificacao_dados ;
        double salario;
        int contador = 0;
        int contador2 = 0;
        int contador3 = 0;
        Scanner sc = new Scanner(System.in);


        while (contador <1){
            System.out.println("deseja se cadastrar para a vaga de emprego? \n 1-sim \n 2-não");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("digite seu nome: ");
                nome = sc.next();
                sc.nextLine();

                System.out.println("digite seu sobrenome: ");
                sobrenome = sc.next();
                sc.nextLine();

                System.out.println("digite a sua idade: ");
                idade = sc.nextInt();
                sc.nextLine();

                System.out.println("digite o dia que você nasceu: ");
                dia = sc.nextInt();


                System.out.println("digite o mês que você nasceu: ");
                mes = sc.nextInt();


                System.out.println("digite o ano que você nasceu: ");
                ano = sc.nextInt();
                sc.nextLine();

                System.out.println("qual seria sua pretensão salarial: ");
                salario = sc.nextDouble();
                sc.nextLine();

                while (contador2 < 1 ){
                    System.out.println("possui CNH tipo B (sim/não): ");
                    cnh = sc.next().toLowerCase();

                    if (cnh.equals("sim")  || cnh.equals("não") ){
                        contador2++;
                    }
                    else {
                        System.out.println("digite uma opção valida");
                    }
                }

                System.out.println("qual o valor de instrução:\n 1-ensino fundamental incompleto\n 2-ensino fundamental compelto\n 3-ensino médio incompleto \n 4-ensino médio completo \n 5-ensino superior incompleto \n 6- ensino superior completo \n  ");
                escolha_usuario = sc.nextInt();
                sc.nextLine();

                switch (escolha_usuario){
                    case 1 :
                        grau_instrucao = "ensino fundamental incompleto";
                        break;
                    case 2 :
                        grau_instrucao = "ensino fundamental completo";
                        break;
                    case 3 :
                        grau_instrucao = "ensino médio incompleto";
                        break;
                    case 4:
                        grau_instrucao="ensino médio completo";
                        break;
                    case 5:
                        grau_instrucao = "ensino superior incompleto";
                        break;
                    case 6 :
                        grau_instrucao = "ensino superior completo";
                        break;
                }

                System.out.println("verifique se todas as informações estão corretas: ");

                System.out.printf("\nnome completo: %s %s",nome,sobrenome);

                System.out.printf("\nidade : ¨%d",idade);

                System.out.printf("\ndata de nascimento : %d/%d/%d",dia,mes,ano);

                System.out.printf("\npretensão salarial : %.2f",salario);

                System.out.printf("\npossui habilitação tipo B: %s%n",cnh);

                System.out.printf("grau de instrução : %s%n",grau_instrucao);



                System.out.println("\nos dados estão corretos? \n 1-sim \n 2-não ");
                verificacao_dados = sc.nextInt();

                if (verificacao_dados == 1){
                    System.out.println("cadastro feito com sucesso");
                }
                else if (verificacao_dados == 2){
                    System.out.println("tente novamente mais tarde");
                }
                else{
                    System.out.println("opção invalida ");
                }

                contador ++;

            } else if (choice == 2) {
                contador ++ ;
            }
            else {
                System.out.println("digite uma opção valida");


            }
        }
        sc.close();
    }
}
