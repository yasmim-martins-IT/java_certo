package entrada_e_saida;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        double valor_de_compra, valor_da_venda,impostos,comisao;
        Scanner sc = new Scanner(System.in);
        String caminho_arquivo = "S://PM//ter//ets//Inter_Setor//COMPARTILHADO//APRENDIZES//DIGITAL_SOLUTIONS_14//YASMIM SAMPAIO MARTINS//1 SEMESTRE//Java//exercicios java 19.12//nota_fiscal.txt";

        System.out.println("Hora de pagar o seu produto!!");

        System.out.printf("Insira o valor de compra: ");
        valor_de_compra = sc.nextDouble();

        System.out.println("calculando o valor da compra....");

        impostos = (30/valor_de_compra)*100;
        comisao = (20/valor_de_compra)*100;
        valor_da_venda = valor_de_compra +impostos+comisao;

        System.out.println("valor inicial = R$"+valor_de_compra);
        System.out.println("valor dos impostos = R$" +impostos);
        System.out.println("valor do representante = r$"+comisao);
        System.out.println("valor final = R$"+valor_da_venda);

        String conteudo_arquivo = "---------nota fiscal--------- \n valor da compra = R$"+valor_de_compra;
        conteudo_arquivo +="\n valor dos impostos= R$"+impostos;
        conteudo_arquivo +="\nvalor do representante = R$ "+comisao;
        conteudo_arquivo +="\n Valor total = R$"+valor_da_venda;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho_arquivo))) {
            // Escreve o conteúdo no arquivo
            writer.write(conteudo_arquivo);
            System.out.println("Arquivo criado e conteúdo escrito com sucesso!");
        }
        catch (IOException e) {
            // Captura exceção caso ocorra algum erro
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }
        sc.close();
    }
}
