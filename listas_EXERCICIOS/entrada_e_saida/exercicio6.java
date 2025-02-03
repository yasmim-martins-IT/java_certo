package entrada_e_saida;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        int i;
        double nota1,nota2,media,soma;
        Scanner sc = new Scanner(System.in);
        for (i=0;i<2;i++){
            System.out.printf("\nnotas do aluno %d",i+1);

            System.out.printf("\ndigite a primeira nota: ");
            nota1 = sc.nextDouble();
            sc.nextLine();

            System.out.printf("\ndigite a segunda nota: ");
            nota2 = sc.nextDouble();
            sc.nextLine();

            media = (nota1*0.40)+(nota2*0.60);



            System.out.printf("a nota do aluno %d é : %.2f \n",i+1,media );
        }
        sc.close();
    }
}
