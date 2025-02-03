public class MATH {
    public static void main(String[] args){
        int a = 10;
        int b = 5;

        System.out.println("operadores aritméticos: ");

        System.out.println("soma:"+(a+b));

        System.out.println("subtração"+(a-b));

        System.out.println("multiplicação"+(a*b));

        System.out.println("divisão"+(a/b));

        System.out.println("Resto:"+(a%b));

        //funções com math

        System.out.println("funções com classe math");

        System.out.println("Valor absoluto de um numero: "+ Math.abs(-10));

        System.out.println("2 elevado a 3: "+ Math.pow(2,3));

        System.out.println("raiz quadrada de 16: "+ Math.sqrt(16));

        System.out.println("maior entre 10 e 5: "+ Math.max(10,5));

        System.out.println("menor entre 10 e 5: "+Math.min(10,5));

        System.out.println("numero aleatório: "+ Math.random());

        System.out.println("arredondamneto de 3,6: "+Math.round(3.6));

        System.out.println("Seno de 30 graus (em radianos): "+Math.sin(Math.toRadians(30)));

        System.out.println("Coseno de 30 graus (em radianos): "+Math.cos(Math.toRadians(30)));

        System.out.println("Tangente de 45 graus (em radianos): "+Math.tan(Math.toRadians(45)));

    }
}
