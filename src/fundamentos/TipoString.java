package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        String texto1 = "wesley";
        texto1 = texto1.toUpperCase();
        System.out.println(texto1);
        texto1 = texto1.toLowerCase();
        System.out.println(texto1);

        System.out.println(texto1.charAt(2));

        System.out.println(texto1.startsWith("w"));
        System.out.println(texto1.endsWith("k"));
        System.out.println("skdfhskjhdfkjshdkjfhsd".length());
        System.out.println(texto1.equals("wesley"));
        System.out.println(texto1.equals("weslEy"));
        System.out.println(texto1.equalsIgnoreCase("weslEy"));
        System.out.println("banana ".trim().equals("banana"));
        String nome = "Ze";
        String sobrenome = "Silva";
        int idade = 32;
        float salario = 4320.50F;

        String informacaoFuncionario = "O funcionario "+nome+" "+sobrenome+" de "+idade+" anos, recebe "+salario+" reais";
        System.out.println(informacaoFuncionario);

        String informacaoFuncionarioFormatado =
                String.format("O funcionario %s %s de %d anos recebe R$%.2f ",nome,sobrenome,idade,salario);
        System.out.println(informacaoFuncionarioFormatado);
    }
}
