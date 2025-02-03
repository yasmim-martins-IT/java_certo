package condicionais;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reposta_correta;
        String reposta_usuario ;

        System.out.printf("Pergunta 1 \n");
        System.out.println("O que é uma API RESTful? \n A)Uma API RESTful é um conjunto de regras e convenções que permitem a comunicação e interação entre sistemas por meio de requisições HTTP.\n B) Um framework para o desenvolvimento de interfaces de usuário \n C)Um tipo de banco de dados relacional");
        System.out.printf("digite a alternativa correta: ");
        reposta_usuario = sc.nextLine().toLowerCase();
        reposta_correta = "a";

        if (reposta_usuario.equals(reposta_correta)){
            System.out.printf("A resposta esta correta!");

        }
        else {
            System.out.printf("A resposta esta errada");
            System.out.println("A respota correta é a letra: "+reposta_correta);

        }
        System.out.printf("\n \n Pergunta 2 \n");
        System.out.println("O que significa a sigla CRUD? \n A)Criar, Remover, Atualizar, Depurar \n B) Criar, Ler, Atualizar, Deletar \n C)Comprimir, Redefinir, Utilizar, Descartar");
        System.out.printf("digite a alternativa correta: ");
        reposta_usuario = sc.nextLine().toLowerCase();
        reposta_correta = "b";
        if (reposta_usuario.equals(reposta_correta)){
            System.out.printf("A resposta esta correta!");

        }
        else {
            System.out.printf("A resposta esta errada\n");
            System.out.println("A respota correta é a letra: "+reposta_correta);

        }
    }
}
