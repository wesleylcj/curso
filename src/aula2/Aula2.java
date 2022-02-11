package aula2;

import util.Util;

public class Aula2 {

    public static void main(String[] args) {

    }

    private static void codigoAbastecimento() {
        System.out.println("inicio de programa calculo de combustivel");
        System.out.println("informe o valor do abastecimento:");

        double abastecimento = Util.letNumeroInteiroUsuario();

        double gasolina = 7;

        double litros = abastecimento / gasolina;

        System.out.println("total:" + litros);
        System.out.println("fim do calculo");
    }


    private static void codigoIdadae() {
        System.out.println("Informe sua idade:");
        int idadeUsuario = Util.letNumeroInteiroUsuario();
        if (idadeUsuario <= 16) {
            System.out.println("acesso negado");
        } else {
            //System.out.println("acesso permitido");
        }


    }

    private static void codigoMesaeCadeira() {
        System.out.println("informe o numero de cadeiras:");
        int numeroCadeiras = Util.letNumeroInteiroUsuario();

        //se numero de cadeira é igual a 4
        if (numeroCadeiras == 4) {
            //numero de cadeira é 4, então imprime o preco 2000
            System.out.println("preço é R$2000,00");
        } else if (numeroCadeiras == 6) {
            //número de cadeiras é 6 cadeiras então imprime o preço de 2400
            System.out.println("preço é R$2400,00");
        } else {
            //senão a opção é inválida
            System.out.println("Opção inválida, só temos mesa com 4 ou 6 cadeiras");
        }
    }


}