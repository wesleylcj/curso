package fundamentos;

public class Tipos {


    public static void main(String[] args) {
        //tipos de dados

        //tipos primitivos
        int numeroInteiro = 23;
        long numeroInteiroMaior = 1000023;
        float numeroVirgula = 2.3f;
        double numeroComVirgulaMaior = 100023.23;
        char caracter = 'a';
        //boolean aceita verdadeiro ou falso, true false
        boolean condicoes = true;

        //tipos customizados, Classe
        String textos = "asd123";
        Boolean condicoesClasse = true;

        MeuTipo meuTipo = new MeuTipo();

        System.out.println(meuTipo.booleanClasse);
        System.out.println(meuTipo.intPrimitivo);
        System.out.println(meuTipo.floatPrimitivo);
        System.out.println(meuTipo.charPrimitivo);
        System.out.println(meuTipo.booleanPrimitivo );
        System.out.println(meuTipo.intClasse);

        //valor padrao do int é zero
        System.out.println(meuTipo.intPrimitivo == 0);
        System.out.println(meuTipo.intPrimitivo == 1);

        char unicode = '\u0040';
        System.out.println(unicode);

    }


}

class MeuTipo{
    public int intPrimitivo;
    public Integer intClasse;
    public float floatPrimitivo;
    public char charPrimitivo;
    public boolean booleanPrimitivo;
    public Boolean booleanClasse;

}
