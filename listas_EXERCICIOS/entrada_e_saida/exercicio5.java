package entrada_e_saida;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        int hora,min,seg,tempo_segundos;
        Scanner sc = new Scanner(System.in);

        System.out.printf("digite a hora: ");
        hora = sc.nextInt();
        sc.nextLine();

        System.out.printf("\ndigite os minutos: ");
        min = sc.nextInt();
        sc.nextLine();

        System.out.printf("\ndigite os segundos: ");
        seg = sc.nextInt();
        sc.nextLine();

        tempo_segundos = (hora *3600) + (min*60) + seg;

        System.out.println("essa hora em segundos é: "+tempo_segundos);

        sc.close();
    }
}
