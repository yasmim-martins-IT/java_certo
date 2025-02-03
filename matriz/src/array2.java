import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        /*final é uma palavra reservada para constantes em python*/
        final int tamanho = 3;

        /*podemos colocar como um tamanho fixos para nossos array*/
        int [] precos = new int[tamanho];

        precos[0] = 18;
        precos[1] = 45;
        precos[2] = 90;

        System.out.println("imprimindo o array de preços");
        /*length usa o tamanho do array tem */
        for (int i = 0 ; i < precos.length;i++){
            System.out.println(precos[i]);


        }
        //------------------------------------------------------------//
        /* for especifico para array */
        for (int linhas:precos){
            System.out.println(linhas);
        }
        Arrays.fill(precos,5);
    }
}
