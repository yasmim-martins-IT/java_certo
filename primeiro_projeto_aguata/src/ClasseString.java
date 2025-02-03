import java.sql.SQLOutput;

public class ClasseString {

    public static void main(String[] args){
          //exemplificando com operadores lógicos:(&&= and) (|| or) (! not)

        boolean condicao1 = true;
        boolean condicao2 =  false;

        //operadores lógicos
        System.out.println("Resultado do operador AND (&&): "+(condicao1 && condicao2)); //falso
        System.out.println("Resultado do operador OR (||): "+ (condicao1 || condicao2)); //true
        System.out.println("Resultado do operador NOT (!)" + (!condicao1 ));//falso

        //usando operadores de incremento e decremento
        int numero = 10;

        //incremento (pós-fixado)

        numero++;//incremento pós fixado
        System.out.println("incremento pós fixado: "+ numero);

        //decremento (pós - fixado)
        numero--;
        System.out.println("decremento pós fixado: "+numero);

        //operadores de incremento e decremento pré-fixado
        System.out.println("incremento pré-fixado: "+ ++numero);
        System.out.println("decremento pré-fixado: "+ --numero);

        //operador ternário
        String resultado = (numero>5) ? "maior que 5" : "menor igual a 5";
        System.out.println("resultado do operador ternário: "+ resultado);

        //trabalhando com Strings
        //criando string diretamente
        String texto = "Java é uma linguagem poderosa";

        //
        char caractere = texto.charAt((5));// vai pegar o caracterena posição 5 (indice começa com 0)
        System.out.println("caractere na posição 5"+ caractere); // vai imprimir é

        boolean termina_com_proderosa = texto.startsWith("Java");
        System.out.println("termina com poderosa? : "+ termina_com_proderosa);

    }
}
