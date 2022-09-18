package Estudos;

public class UsoIfElse {

    public static void main(String[] args) {

        float nota1 = 8.5F;
        float nota2 = 8.5F;

        float media = (nota1 + nota2) / 2F;

        if (media <5){
            System.out.println("Reprovado");

        } else if(media >= 8.5){
            System.out.println("Aluno candidato a bolsa");
        }

        else{
            System.out.println("Aprovado");
        }


    }

}
