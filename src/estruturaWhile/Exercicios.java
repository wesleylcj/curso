package estruturaWhile;

import util.Util;

public class Exercicios {
    public static void main(String[] args) {

        int numero = 5;

        boolean repetir = true;

        while (repetir) {
            System.out.println("informe um numero inteiro:");
            int numeroInformado = Util.letNumeroInteiroUsuario();
            if (numeroInformado == 5) {
                System.out.println("numero correto");
                repetir = false;
            } else {
                System.out.println("numero incorreto, informe outro numero:");
            }

            System.out.println(numero);
        }

    }
}
