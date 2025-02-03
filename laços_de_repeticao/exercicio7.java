import java.util.*;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<Object>> pessoas = new HashMap<>();

        String nomeMaisAlto = "";
        int alturaMaisAlta = 0;
        String nomeMaisPesado = "";
        int pesoMaisPesado = 0;

        for (int i = 0; i < 7; i++) {
            System.out.printf("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.printf("Digite sua altura em cm: ");
            int altura = sc.nextInt();

            System.out.printf("Digite seu peso em kg: ");
            int peso = sc.nextInt();
            sc.nextLine();

            List<Object> pessoa = new ArrayList<>();
            pessoa.add(nome);
            pessoa.add(altura);
            pessoa.add(peso);

            pessoas.put(nome, pessoa);

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeMaisAlto = nome;
            }

            if (peso > pesoMaisPesado) {
                pesoMaisPesado = peso;
                nomeMaisPesado = nome;
            }
        }

        System.out.printf("\nA pessoa mais alta é %s com %d cm de altura.\n", nomeMaisAlto, alturaMaisAlta);

        System.out.printf("A pessoa mais pesada é %s com %d kg.\n", nomeMaisPesado, pesoMaisPesado);

    }
}


