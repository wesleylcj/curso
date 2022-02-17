package estruturaWhile;

import util.Util;

public class While {
    public static void main(String[] args) {
        /*int x = 1;
        while(x <= 5){
            System.out.println("rodando while");
            System.out.println("x = "+x);
            x =x+1;
        }
        System.out.println("depois do while");*/

        String senhaSalvaNoBancoDados = "ABC123";

        boolean continuar = true;

        //enquanto condição é verdade
        while (continuar) {
            //execute o código dentro do while
            System.out.println("Informe a senha");
            String senhaInformada = Util.lerTextoUsuario();

            if (senhaInformada.equals(senhaSalvaNoBancoDados)) {
                System.out.println("está logado no sistema");
                continuar = false;
            } else {
                System.out.println("Senha incorreta, tente novamente");
            }
        }//repita
        System.out.println("terminou while");


    }
}
