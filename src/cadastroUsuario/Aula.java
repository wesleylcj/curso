package cadastroUsuario;

import util.Util;

public class Aula {
    public static void main(String[] args) throws InterruptedException {
        boolean continuar = true;

        while (continuar){
            System.out.println("Informe a operação desejada:");
            System.out.println("1 - soma:");
            System.out.println("2 - multiplicação:");
            System.out.println("0 - sair");
            int numeroDaOperacao = Util.letNumeroInteiroUsuario();

            if(numeroDaOperacao == 1){
                System.out.println("Informe o primeiro número:");
                int primeiroNumero =  Util.letNumeroInteiroUsuario();
                System.out.println("Informe o segundo número:");
                int segundoNumero =  Util.letNumeroInteiroUsuario();

                int soma = primeiroNumero + segundoNumero;
                System.out.println("O resultado da soma é: " + soma);
            }

            if(numeroDaOperacao == 2){
                System.out.println("Informe o primeiro número:");
                int primeiroNumero =  Util.letNumeroInteiroUsuario();
                System.out.println("Informe o segundo número:");
                int segundoNumero =  Util.letNumeroInteiroUsuario();

                int soma = primeiroNumero * segundoNumero;
                System.out.println("O resultado da multiplicação é: " + soma);
            }

            if(numeroDaOperacao == 0){
                System.out.println("Finalizando, obrigado por usar a nossa calculadora!");
                continuar = false;
            }
        }




    }
}
