package aula06_06;
import java.util.Scanner;
import java.util .Random;
class Main {
    public static void main(String[] args) {

        Random gerador = new Random();
        int x = gerador.nextInt(100);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Advinhe o numero que estou pensando?");
        int numero = entrada.nextInt();

        if(numero == x){
            System.out.println("Voce acertou !!!");
        }else{
            System.out.println("Voce errou, eu pensei no " + x);
        }

    }
}
