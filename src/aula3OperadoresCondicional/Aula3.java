package aula3OperadoresCondicional;

public class Aula3 {
    public static void main(String[] args) {
        // == comparar
        // > maior que
        // < menor que
        // >= maior ou igual
        // <= menor ou igual
        // && verifica se 2 condições são verdadeiras
        // true && true
        int x = 10;
        int y = 20;
        boolean condicaoX = x >= 10;
        boolean condicaoY = y < 25;
        boolean resultadoCondicao = condicaoX && condicaoY && x < 50;

        System.out.println("A condição x é : " + condicaoX);
        System.out.println("A condição y é : " + condicaoY);
        System.out.println("A condição && é : " + resultadoCondicao);

        //condicao com &&
        if (condicaoX && condicaoY && x < 50) {
            System.out.println("Entrou no if do ê &&");
        } else {
            System.out.println("Entrou no else ê &&");
        }

        int z = 10;
        int w = 20;

        //condicao com ou
        if (z > 10 || w == 20) {
            System.out.println("Entrou no if do ou ||");
        } else {
            System.out.println("Entrou no else do ou ||");
        }
    }
}
