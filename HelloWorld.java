public class HelloWorld{

    public static void main(String[] args){

        double nota1 = 2;
        double nota2 = 2;
        double nota3 = 4;

        double media = (nota1 + nota2 + nota3)/3;

        double falta = (10 - media);

        if (media >= 7) {
            System.out.println("Voce esta aprovado!");
        } else {
            System.out.println("Voce esta de exame!");
        }
        if (media < 7){
            System.out.println("Faltam:" + falta + " para ser aprovado");
        }

        System.out.println(media);
        
    }

}