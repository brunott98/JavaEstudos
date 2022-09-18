package Estudos;

import java.util.Scanner;

public class testeBasico {

    public static void main(String[] args) {
        int a = 123;
        Integer b = new Integer(a);

        System.out.println(b.toString().length());

        Scanner entrada = new Scanner(System.in);



        System.out.print("Informe o salário:");
        String salario1 =  entrada.next().replace(",",".");

        Double salario1Tratado = Double.parseDouble(salario1);
        System.out.println(salario1Tratado);


    }


}
