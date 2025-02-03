package condicionais;
import java.util.Random;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int contador = 0;

        int num_sorte = random.nextInt(101);
        System.out.println(num_sorte);

        while (contador < 3)   {

            System.out.printf("Tente acertar o numero da sorte :");
            int chute = sc.nextInt();

            if (chute == num_sorte){
                System.out.printf("Você acertou!");
                break;
            }
            else {
                System.out.printf("Você errou \n");
                contador++;
            }

        }
    }
}
