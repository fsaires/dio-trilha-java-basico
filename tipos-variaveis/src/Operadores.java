public class Operadores {

    //https://felipe-silva-aguiar.gitbook.io/dio-java/gitbook/sintaxe/operadores

    public static void main(String[] args) {
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;
        
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);
    }
    
}
