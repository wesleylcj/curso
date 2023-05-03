package estruturaWhile;

public class WhileVersao2 {
    public static void main(String[] args) {
        int contador = 1;

        boolean condicaoPraContinuar = true;

        //enquanto a condição para continuar for verdadeira executa o while
        while (condicaoPraContinuar){
            System.out.println(contador);
            contador = contador + 1;
            condicaoPraContinuar = contador <= 10;
        }

    }
}
