package Estudos;

public class testandoCasting {

    public static void main(String[] args){
        double a = 1;
        System.out.println(a); //1.0  conversão implícita

        float b = (float) 1.0; //casting (tipo) valor conversão explícita



        //Exercicio - como descobrir o número de algarimos de um número
        Integer num1 = 123456789;
        System.out.println(num1.toString().length());   //9 caracteres



        //Conversão de string para númerico

        String valor1 = "100.55";
        System.out.println(valor1 + "11"); //100.5511 concatenou strings
        double numero1 = Double.parseDouble(valor1);
        System.out.println(numero1 + 12); //112.55 fez a soma






    }






}

