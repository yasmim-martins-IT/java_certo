public class array {
    public static void main(String[] args) {
        /* [] array
        new- instanciar uma nova classe
        um array é semelhante a criar varias variaveis de uma vez
         */
        int [] numeros = new int[5]; /* cria um array de tipo inteiro com cinco posições */

        /*atribuindo valores a posições
        * obs caso não atribua um valor todos os valores são iguais a zero */
        numeros[0] = 10;
        numeros[1] = 11;
        numeros[2] = 15;
        numeros[3] = 12 ;
        numeros[4]= 4 ;

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);

    }
}
