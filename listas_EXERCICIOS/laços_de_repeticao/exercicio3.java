import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opniao_ruim = 0;
        int opniao_bom = 0;
        int opiniao_otimo = 0;
        int total_pessoas = 0;
        int contador = 0;

        while (true) {
            System.out.printf("Deseja avaliar o filme? (S/N): ");
            String escolha = sc.nextLine().trim().toUpperCase();

            if (escolha.equals("S")) {
                System.out.printf("Como você gostaria de avaliar o filme? \n1 - Ótimo \n2 - Bom \n3 - Ruim\n");
                int avaliacao = sc.nextInt();
                sc.nextLine();  // Clear the buffer

                switch (avaliacao) {
                    case 1:
                        System.out.println("Filme avaliado com sucesso");
                        opiniao_otimo++;
                        break;
                    case 2:
                        System.out.println("Filme avaliado com sucesso");
                        opniao_bom++;
                        break;
                    case 3:
                        System.out.println("Filme avaliado com sucesso");
                        opniao_ruim++;
                        break;
                }
                total_pessoas++;
            } else {
                break;
            }
        }
        double opniao_otimo_porcentagem = (double) opiniao_otimo / total_pessoas * 100;
        double opniao_bom_porcentagem = (double) opniao_bom / total_pessoas * 100;
        double opniao_ruim_porcentagem = (double) opniao_ruim / total_pessoas * 100;

                double media_notas = (opiniao_otimo*3+opniao_bom*3+opniao_ruim*3)/total_pessoas;

                System.out.println("Porcentagem de pessoas que responderam ótimo : "+opniao_otimo_porcentagem + "%");
                System.out.println("Porcentagem de pessoas que responderam bom : "+opniao_bom_porcentagem + "%");
                System.out.println("Porcentagem de pessoas que responderam ruim : "+opniao_ruim_porcentagem + "%");
                System.out.println("total e pessoas que responderam :"+total_pessoas);
                System.out.println("média das notas do filme :"+media_notas);
            }


    }

