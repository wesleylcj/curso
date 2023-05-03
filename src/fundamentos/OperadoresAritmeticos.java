package fundamentos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int numeroInteiro = Integer.MAX_VALUE;
        System.out.println("valor maximo do int : " + numeroInteiro);
        long numeroInteiroMaior = Long.MAX_VALUE;
        System.out.println("valor maximo do long : " + numeroInteiroMaior);
        long x = numeroInteiro;
        System.out.println("atribuir long ao int: " + x);
        long outroLong = 500;
        //cast conversão de tipo
        int y = (int) outroLong;
        System.out.println("int convertido do long com cast: " + y);
        y = (int) numeroInteiroMaior;
        System.out.println("outro int convertido do long com cast: " + y);

        String numeroEmTexto = "500";
        int numeroConvertidoDOString = Integer.parseInt(numeroEmTexto);
        System.out.println(numeroConvertidoDOString);

        //operadores
        int a = 10;
        int b = 20;
        int resultado = a + b;
        System.out.println(resultado);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);
        float c = (float) b;
        System.out.println(a / c);

        System.out.println("resto da divisao de 10 por 2: " + 10 % 2);
        System.out.println(a + b / c);
        float res = b / c;
        System.out.println(a + res);

        //raiz quadrada e potencia
        double potencia2ElevadoAoCubo = Math.pow(2,3);
        System.out.println(potencia2ElevadoAoCubo);
        double raizDe25 = Math.sqrt(25);
        System.out.println(raizDe25);

    }
}
