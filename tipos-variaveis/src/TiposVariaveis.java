public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        String meuNome = "Fernando Aires";
        System.out.println(meuNome);

        double salarioMinimo = 2500;
        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        int numero = 1;
        numero = 2;
        System.out.println(numero);


        final double VALOR_PI = 3.14;
        System.out.println(VALOR_PI);
    }
}
