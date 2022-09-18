package Estudos;

import java.util.Scanner;

public class ConsoleImport {
    public static void main(String[] args) {

        System.out.printf("Salário: %.1f%n",12000.20);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: "); //print não pula linha
        String nome = entrada.nextLine();

        System.out.print("Informe seu hobbie: "); //print não pula linha
        String hobbie = entrada.nextLine();

        System.out.print("Informe sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("O hobbie de %s é %s e possui %s anos.%n",nome,hobbie,idade);



        entrada.close();


    }
}
