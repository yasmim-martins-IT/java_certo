import java.util.Scanner;

public class Main { //tenho a classe publica, a privada e a protegida , o main é o funcional de para a IDE conseguir interpretar o código
    public static void main(String[] args) {//static = statica void = não retorna nada
        //scnner para receber input do usuário
        Scanner batatinhaFrita = new Scanner(System.in);

        int idade = 25;
        double altura = 1.76;
        char inicial = 'a';
        boolean estudante = true;

        ///demonstando diferentes tipos de entrada
        System.out.print("\nexemplos de saida:");//print imprime sem pular linha
        System.out.print("\nsocorro ");//sout cria o system out print sem precisar escrever

        System.out.println("exemplo de print z\n"); // \n é oque faz pular linha

        //usando print para a formatação de string
        //%d é usado para identificar inteiros
        //%2f é usados para float ou doubles com duas casas decimimais
        //%c é usado para caracteres

        System.out.printf("\nMinha idade é: %d anos, minha altura é %.2f, minha inicial é %c",idade,altura,inicial);

        //solicitando entrada do usuario

        System.out.print("\ndigite seu nome: ");
        String nome = batatinhaFrita.nextLine();
        System.out.printf("\no seu nome é %s",nome);

        System.out.println("\n Digite sua altura: ");
         double altura_usuario =  batatinhaFrita.nextDouble();
         // o java entende pontos flutuantes com , nçao com . que é o padrão americano
         System.out.printf("\n Sua altura é: %.2f",altura_usuario);

         if (altura_usuario >= 1.60){
            System.out.println("\nvocê é acima da média");
        }
         else {
             System.out.println("\n Você é abaixo da média");
         }

         var contador = 0;

         while (contador<=1){
             System.out.print("deseja dizer seu hobbie: \n 1-sim \n 2- não \n digite aqui: ");
             var escolha = batatinhaFrita.nextInt();
             batatinhaFrita.nextLine();

             if (escolha == 1 ){
                 System.out.print(" \n qual seu hobbie?: ");
                 String hobie = batatinhaFrita.nextLine();
                 System.out.printf("\nseu hobie é : %s",hobie);
             }
             if (escolha == 2){
                 break;
             }
         }
         batatinhaFrita.close();
    }
}