package laços_de_repeticao;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,List<Object>> informacoes = new HashMap<>();
        String nome ;
        float altura ;
        float peso ;
        byte idade ;
        int contador = 0;

        while (contador <10){
            System.out.printf("digite seu nome : ");
            nome = sc.nextLine();
            sc.nextLine();
            System.out.printf("\nDigite a sua idade: ");
            idade = sc.nextByte();
            sc.nextLine();
            System.out.printf("\ndigite sua altura: ");
            altura = sc.nextFloat();
            sc.nextLine();
            System.out.printf("\ndigite seu peso: ");
            peso = sc.nextFloat();

            List<Object> dados = new ArrayList<>();
            dados.add(idade);
            dados.add(altura);
            dados.add(peso);

            informacoes.put(nome, dados);
            contador++;
        }
        System.out.println("dados coletado :");

        for (Map.Entry<String, List<Object>> entry : informacoes.entrySet()) {
            String nome_pessoa = entry.getKey();
            List<Object> dados_pessoa = entry.getValue();


            System.out.println("Nome: " + nome_pessoa);
            System.out.println("Idade: " + dados_pessoa.get(0) + ", Altura: " + dados_pessoa.get(1) + " cm, Peso: " + dados_pessoa.get(2) + " kg");

        }
    }
}
