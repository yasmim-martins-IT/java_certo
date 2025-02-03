import java.util.Scanner;
public class Main {
    public static final String RESET = "\033[0m";      // Resetando as cores
    public static final String VERMELHO = "\033[31m";   // Vermelho
    public static final String VERDE = "\033[32m";      // Verde
    public static final String AMARELO = "\033[33m";    // Amarelo
    public static final String AZUL = "\033[34m";       // Azul
    public static final String ROXO = "\033[35m";       // Roxo
    public static final String CIANO = "\033[36m";      // Ciano
    public static final String BRANCO = "\033[37m";     // Branco

    // Códigos ANSI para as cores de fundo
    public static final String FUNDO_VERMELHO = "\033[41m";   // Fundo Vermelho
    public static final String FUNDO_VERDE = "\033[42m";      // Fundo Verde
    public static final String FUNDO_AMARELO = "\033[43m";    // Fundo Amarelo
    public static final String FUNDO_AZUL = "\033[44m";       // Fundo Azul
    public static final String FUNDO_ROXO = "\033[45m";       // Fundo Roxo
    public static final String FUNDO_CIANO = "\033[46m";      // Fundo Ciano
    public static final String FUNDO_BRANCO = "\033[47m";     // Fundo Branco
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //cria um scanner

        System.out.println("digite o numero que quer saber a tabuada: "); // print para indicar ao usuário oque fazer

        int num = scanner.nextInt(); //declara variavel num
        byte contador = 0; //declara a varivael que servira de contador

        while (contador <= 10) { //loop que vai funcionar enquanto o contador for menor que zero
            int tabuada = num * contador; //variavel que vai fazer a multiplicação
            System.out.printf("%d x %d = %d\n", num, contador, tabuada); //print do resultado
            contador++; //incremento

        }



        for(byte contador_for = 0 ; contador_for < 4 ; contador_for++) {

            System.out.println(VERDE + "\nPython é muito bom" + RESET);
        }

        //soma de numeros de 1 a N

        Scanner scanne2 = new Scanner(System.in);
        System.out.println("Digite até aonde você quer que seja feita a soma:");
        int n = scanne2.nextInt();  // Número até onde a soma será feita
        int numero = 1;  // Começando a soma de 1

        // Loop que vai de 0 até o número n-1 (para realizar a soma)
        for (int contadore = 0; contadore < n; contadore++) {
            // Calcula a soma acumulada
            int soma = numero + contadore;
            // Imprime a soma até o momento
            System.out.printf("%d + %d = %d\n", numero, contadore, soma);
            // Atualiza o número para a soma acumulada
            numero = soma;
        }
    }
}

