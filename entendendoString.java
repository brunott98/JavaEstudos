package Estudos;

public class entendendoString {


    public static void main(String[] args) {
        String saudacao = "Bom dia";
        System.out.println(saudacao.charAt(0));
        System.out.println("Donald".charAt(0));
        //Strings são objetos imutáveis
        System.out.println(saudacao.equals("Bom dia"));  //true
        System.out.println(saudacao.equalsIgnoreCase("BOM DIA"));  //true


        String nome = "Bruno";
        String sobrenome = "Teixeira";
        byte idade = 24;
        short salario =  12000;

        System.out.printf("%s %s tem %s anos e ganha %s reais",nome,sobrenome,idade,salario);
        //Bruno Teixeira tem 24 anos e ganha 12000 reais.
    }

}
