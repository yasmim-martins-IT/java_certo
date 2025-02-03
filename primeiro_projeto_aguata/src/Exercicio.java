import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        //exercicio 1
        Scanner sc = new Scanner(System.in);
        /*byte contador = 0;

        while (contador < 1){

            System.out.println("deseja fazer a conversão de alguma temperatura (sim/não): ");
            String choice = sc.nextLine().toLowerCase(Locale.ROOT);

            if (choice.equals("sim")){
                System.out.println("deseja converter a temperatura para qual sistema de medida: \n 1-celcius \n 2-farenheit \n digite aqui: ");
                byte conversor = sc.nextByte();
                sc.nextLine();

                if (conversor == 2){
                    System.out.println("digite a temperatura em graus celcius: ");
                    double temp_celcius = sc.nextDouble();
                    sc.nextLine();

                    double temp_farenheit = (temp_celcius*9/5)+32;

                    System.out.printf("a temperatura em farenheit é: %.2f%n ",temp_farenheit);

                }
                if (conversor == 1) {
                    System.out.println("digite a temperatura em farenheit: ");
                    double temp_farenheit = sc.nextDouble();
                    sc.nextLine();

                    double temp_celcius = (temp_farenheit - 32) * 5 / 9;

                    System.out.printf("a temperatura em celcius é: %.2f%n ", temp_celcius);
                }
            }
            if(choice.equals("não")) {
                contador++;
            }
        }*/

        //exercicio 2
       /* boolean continuar = true;

        while(continuar){
            System.out.println("deseja saber seu IMC (sim/não): ");
            String choice = sc.nextLine().toLowerCase(Locale.ROOT);


            if(choice.equals("sim")){
                System.out.println("digite sua altura em metros: ");
                double altura = sc.nextDouble();
                sc.nextLine();

                System.out.println("digite seu peso em quilos: ");
                double peso = sc.nextDouble();
                sc.nextLine();

                double imc = (peso/Math.pow(altura,2));

                System.out.printf("seu imc é : %.2f%n",imc);

            }
            if (choice.equals("não")){
                continuar = false;
            }

        }*/

        //exercicio4
       /* System.out.println("digite o valor desejado: ");
        double num  = sc.nextDouble();

        double quadrado = Math.pow(num,2);
        double cubo = Math.pow(num,3);

        System.out.printf("o valor de %.2f ao quadrado: %.2f%n",num,quadrado);
        System.out.printf("o valor de %.2f ao cubo: %.2f%n",num,cubo);*/

        //exercicio5

       /* System.out.println("digite a altura do triangulo: ");
        double altura = sc.nextDouble();

        System.out.println("digite a base do triangulo : ");
        double base = sc.nextDouble();

        double area_triangulo = (base*altura)/2;

        System.out.println("a area do triangulo é: "+area_triangulo);*/

        /*System.out.println("a formula da equação do segunda grau é ax^2+bx+c=0");

        System.out.printf("digite o valor de a: ");
        double a = sc.nextDouble();

        System.out.printf("digite o valor de b: ");
        double b = sc.nextDouble();

        System.out.printf("digite o valor de c: ");
        double c =sc.nextDouble();

        double delta = Math.pow(b,2)-4*a*c;

        System.out.println("o valor do delta é: "+delta);*/


        double conta1 = 3*Math.pow(-3/4,1)+ 6*(Math.pow(3,-1)/4)-4;
        System.out.println(conta1);

        double conta2 = 7+(4/-3)+2;
        System.out.println(conta2);


    }

}
