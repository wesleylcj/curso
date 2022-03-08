package exercicios;

import util.Util;

public class Exercicios1 {

    public static void main(String[] args) {

        //investigarCrime();
        //maiorNumero();
        //posistivoNegativoParImpar();
        //diaDaSemana();
        calcularMedia();
    }

    /*
   Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
   As perguntas são:
       “Telefonou para a vítima? “
       “Esteve no local do crime?”
       “Mora perto da vítima? “
       “Devia para a vítima? “
       “Já trabalhou com a vítima? “

   O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
   Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”,
   entre 3 e 4 como “Cúmplice”
   e 5 como “Assassino“.
   Caso contrário, ele será classificado como “Inocente“.
   */
    static void investigarCrime() {
        System.out.println("iniciando investigar crime:");
        String nomeProcurado = "joao";
        int idadeProcurado = 25;
        String enderecoProcurado = "rj vinte";
        String corProcurado = "branco";
        String generoProcurado = "masculino";


        System.out.println("1-digite seu nome:");
        String nome = Util.lerTextoUsuario();
        System.out.println("2-digite sua idade:");
        int idade = Util.letNumeroInteiroUsuario();
        System.out.println("3-digite seu endereço:");
        String endereco = Util.lerTextoUsuario();
        System.out.println("4-digite sua cor:");
        String cor = Util.lerTextoUsuario();
        System.out.println("5-digite seu genero:");
        String genero = Util.lerTextoUsuario();

        int contador = 0;

        if (nome.equals(nomeProcurado)) {
            contador = contador + 1;
        }
        if (idade == 25) {
            contador = contador + 1;
        }
        if (endereco.equals(enderecoProcurado)) {
            contador = contador + 1;
        }
        if (cor.equals(corProcurado)) {
            contador = contador + 1;
        }
        if (genero.equals(generoProcurado)) {
            contador = contador + 1;
        }
        if (contador == 2) {
            System.out.println("suspeito");

        } else if (contador == 3 || contador == 4) {
            System.out.println("cumplice");
            diaDaSemana();
        } else if (contador == 5) {
            System.out.println("culpado");
        } else {
            System.out.println("inocente");

        }
    }

    // O usuário irá informar dois números e o programa irá imprimir o maior destes dois números
    static void maiorNumero() {
        System.out.println("informe um numero inteiro:");
        int primeiroNumero = Util.letNumeroInteiroUsuario();
        System.out.println("informe um numero inteiro:");
        int segundoNumero = Util.letNumeroInteiroUsuario();

        if (primeiroNumero > segundoNumero) {
            System.out.println(primeiroNumero);
        } else {
            System.out.println(segundoNumero);
        }
    }

    /*
     *Faça um programa que receba um número inteiro e informe se é positivo ou negativo e se é par ou impar.
     * use operador resto % para verificar par ou impar
     */
    static void posistivoNegativoParImpar() {
        System.out.println("digite um numero inteiro:");
        int numeroInf = Util.letNumeroInteiroUsuario();
        if (numeroInf > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("negativo");
        }
        int parImpAR = (numeroInf % 2);
        if (parImpAR == 0) {
            System.out.println("numero par");
        } else {
            System.out.println("numero impar");

        }
    }

    /*
    Faça um Programa que leia um número e exiba o dia correspondente da semana. (1- Domingo , 2- Segunda, etc.)
    se digitar outro valor deve aparecer “valor inválido)
    */
    static void diaDaSemana() {
        System.out.println("digite o numero do dia da semana:");
        int diaInf = Util.letNumeroInteiroUsuario();

        if (diaInf == 1 || diaInf == 8 || diaInf == 15 || diaInf == 22 || diaInf == 29) {
            System.out.println("domingo");
        } else if (diaInf == 2 || diaInf == 9 || diaInf == 16 || diaInf == 23 || diaInf == 30) {
            System.out.println("segunda");
        } else if (diaInf == 3 || diaInf == 10 || diaInf == 17 || diaInf == 24 || diaInf == 31) {
            System.out.println("terca");
        } else if (diaInf == 4 || diaInf == 11 || diaInf == 18 || diaInf == 25) {
            System.out.println("quarta");
        } else if (diaInf == 5 || diaInf == 12 || diaInf == 19 || diaInf == 26) {
            System.out.println("quinta");
        } else if (diaInf == 6 || diaInf == 13 || diaInf == 20 || diaInf == 27) {
            System.out.println("sexta");
        } else if (diaInf == 7 || diaInf == 14 || diaInf == 21 || diaInf == 28) {
            System.out.println("sabado");
        } else
            System.out.println("numero invalido");
    }
    /*
     Faça um programa para calcular a média ponderada de um aluno.
     A prova 1 terá peso 1 a p2 peso 2, P3 peso 3 e P4 peso 4.
     O aluno deverá informar as notas das 4 provas e o programa deverá mostrar qual é a média e se está aprovado ou reprovado.
     A média de aprovação é 6.
     */
        static void calcularMedia () {
            System.out.println("informe a nota da p1;");
            double notaP1=Util.lerNumeroComVirgulaUsuario();
            System.out.println("informe a nota da P2");
            double notaP2=Util.lerNumeroComVirgulaUsuario();
            System.out.println("informe a nota da p3");
            double notaP3=Util.lerNumeroComVirgulaUsuario();
            System.out.println("informe a nota da p4");
            double notaP4=Util.lerNumeroComVirgulaUsuario();

            double calcularNotas=(notaP1*1+notaP2*2+notaP3*3+notaP4*4);
            double media = (calcularNotas/10);
            System.out.println("calculo das notas:"+Util.formataDouble(media));

        }

    /*
     - Num evento os participantes receberão um crachá com um número x por ordem de chegada no seguinte formato "[x]".
    Usando while imprima todos os crachás necessários para a quantidade de participantes a ser informada pelo usuário.
    EX: para 3 participantes, imprimir
    [1]
    [2]
    [3]
     */
        static void imprimirCracha () {

        }

    /*
    4 - Faça um programa que leia um número inteiro do usuário e usando while imprima a sua tabuada.
    */
        static void calcularTabuada () {

        }

    /* DIFICIL
     5 - Usando while faça um programa que leia a renda de todos os integrantes de uma familia,
      calcule e imprima a renda familiar per capita.
    */
        static void calcularRendaPerCapita () {

        }

    /*DIFICIL
   Faça um programa que calcule quantos metros quadrados tem uma casa e imprima a sua área.
   O usuário deverá informar o nome, a largura e o comprimento de cada cômodo, podendo informar N número de cômodos.
   O programa deverá então calcular a área de cada cômodo, imprimir as áreas calculadas de cada cômodo e a área total.
   */
        static void calculoArea () {

        }
    }
