public class condicionais {
    public static void main(String[]args){
        double media = 3.5;
        int faltas = 20;
        boolean postura = true;
        String situacao;

        //estrutura  condicional if-else que avalia a situação do aluno com base na media,faltas  postura

        //se a média for maior ou igual a  5.0,o nmero de faltas for menor que 25 e a postura for positiva

        if(media >= 5.0 && faltas < 25 && postura == true){
            situacao = "aprovado";
            System.out.println(situacao);
        }
        else if (media<5.0 && faltas<25 && postura) {
            situacao = "recuperação";
            System.out.println(situacao);
        }
        else if (media<5.0 && faltas<25 && postura == false) {
            situacao = "Chamar para conversar";
            System.out.println(situacao);
        }
        else{
            situacao = "reprovado";
            System.out.println(situacao);
        }



    }
}
