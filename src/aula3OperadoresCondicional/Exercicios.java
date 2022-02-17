package aula3OperadoresCondicional;

import util.Util;

public class Exercicios {

    public static void main(String[] args) {

        //exercicio 1
        //calcularIdadeEmDias();
        //exercicio 2
        //calcularMedidasCircunferencia();
        //exercicio 3
        //doarSangue();
        //exercicio 4
        decidirEntreAlcoolGasolina();

    }

    /*
        1 - Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
        dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
*/
    public static void calcularIdadeEmDias() {

        System.out.println("Informe os anos do nascimento:");
        int anosNascimento = Util.letNumeroInteiroUsuario();

        System.out.println("Informe meses do nascimento:");
        int mesesNascimento = Util.letNumeroInteiroUsuario();

        System.out.println("Informe dia do nascimento:");
        int diaNascimento = Util.letNumeroInteiroUsuario();

        int calculoDias = anosNascimento * 365 + mesesNascimento * 30 + diaNascimento;
        System.out.println("Idade em dias:" + calculoDias);
    }





        /*2 -   Escreva um programa que pergunte o raio de uma circunferência,
        e sem seguida mostre o diâmetro, perimetro e área da circunferência
        formulas:
        diametro é igual duas vezes o raio
        perimetro é igual ao diâmetro vezes o número PI
        area é igual ao número PI vezes o raio ao quadrado (PI * raio * raio)*/

    static void calcularMedidasCircunferencia() {

        double numeroPi = Math.PI;

        System.out.println("digite o raio da circunferencia:");
        double raioInformado = Util.lerNumeroComVirgulaUsuario();
    
        double diametro = raioInformado * 2;
        System.out.println("diametro:" + Util.formataDouble(diametro));

        double perimetro = diametro * numeroPi;
        System.out.println("perimetro:" + Util.formataDouble(perimetro));

        double area = numeroPi * raioInformado * raioInformado;
        System.out.println("area:" + Util.formataDouble(area));
    }


        /*3 - Para doar sangue é necessário ter entre 18 e 67 anos.
        Faça um programa que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não.*/


    static void doarSangue() {

        System.out.println("Informe sua idade:");
        int idadeDoDoador = Util.letNumeroInteiroUsuario();

        if (idadeDoDoador >= 18 && idadeDoDoador <= 67) {
            System.out.println("Doador Habilitado");
        } else {
            System.out.println("Doador Nao Habilitado.");
        }
    }

       /* 4 - O álcool tem uma eficiência 30% menor do que a gasolina, baseado nisso faça um programa que leia os preços do litro
        do álcool e da gasolina e indique ao usuário qual melhor combustível para abastecer o carro.
        dica: se o preco do alcool for maior ou igual a 70% do preço da gasolina não vale a pena.*/

    static void decidirEntreAlcoolGasolina() {

        System.out.println("informe o valor da gasolina:");
        double precoGasolina = Util.lerNumeroComVirgulaUsuario();

        System.out.println("informe o valor do alcool:");
        double precoAlcool = Util.lerNumeroComVirgulaUsuario();

        double precoAlcoolIdeal = precoGasolina * 0.7;
        System.out.println("preco do alcool ideal:" + Util.formataDouble(precoAlcoolIdeal));

        if (precoAlcool <= precoAlcoolIdeal) {
            System.out.println("abasteca com alcool!");
        } else {
            System.out.println("abasteca com gasolina");
        }

    }

}