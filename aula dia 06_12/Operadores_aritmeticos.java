public class Operadores_aritmeticos {

    public static void main(String[]args){

        int a = 10;
        int b = 5;
        double x = 7.5;
        double y = 3.2;

        //adição
        int somaInteiros = a+b;
        double somaDecimais = x+y;
        System.out.println("soma inteiros: "+somaInteiros);
        System.out.println("soma decimais: "+somaDecimais);

        //subtração

        int subtracaoInteiros = a-b;
        double subtracaoDecimais = x-y;
        System.out.println("sutração de inteiros: "+subtracaoInteiros);
        System.out.println("subtracao de decimais: "+subtracaoDecimais);

        //multiplicação
        int multiplicacaoInteiros = a*b;
        double multiplicacaoDecimais = x*y;
        System.out.println("multiplicacao de deimais: "+multiplicacaoInteiros);
        System.out.println("multiplicacao inteiros: "+multiplicacaoDecimais);

        //divisão
        int divisaoInteiros = a/b;
        double divisaoDecimais = x/y;
        System.out.println("divisão inteiros: "+divisaoInteiros);
        System.out.println("divisão decimais: "+divisaoDecimais);

        //incremento(++)
        int incremento = a;
        incremento++;
        System.out.println("incremento de a: "+incremento);

        //descremento(--)
        int decremento = a;
        decremento--;
        System.out.println("decremento de a: "+decremento);

        //exemplo de expressão com multiplos operadores
        double resultadoComplexo = (x*y) *(a-b)/2;
        System.out.println("resultado da expressão: "+resultadoComplexo);
    }
}
