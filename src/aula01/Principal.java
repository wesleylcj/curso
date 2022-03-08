package aula01;


import util.Util;

public class Principal {
    public static void main(String[] args) {



        System.out.println("informe seus rendimentos:");
        float receita= Util.lerNumeroComVirgulaUsuario();
        System.out.println(" informe suas despesas:");
        float despesas= Util.lerNumeroComVirgulaUsuario();
        float saldo= receita-despesas;
        System.out.println(" Saldo:R$"+saldo);


        String viatura = "viatura";
        System.out.println(" insira o prefixo:");
        String prefixo = Util.lerTextoUsuario();
        viatura = viatura + " " + "baixada";
        viatura = viatura + " versa ";
        viatura = viatura + prefixo;
        System.out.print(viatura);





    }
}

