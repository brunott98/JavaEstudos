package Estudos;

public class AreaCircunferencia {

    public static void main(String[] args){

        double raio = 3.4;
        final double pi = 3.141;   //Travando pi

        double area = raio * raio * pi;
        System.out.println("Área = "+ area + "m²");

        raio = 15;
        area = raio*raio*pi;
        System.out.println("Área = "+ area + "m²");

    }
}
