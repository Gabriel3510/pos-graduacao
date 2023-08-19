package introducao_java.aula04_06;
import java.util.Scanner;
class Main {
    public static void main(String[] args){
        //println é o unico que pula linha
        System.out.println("Ola mundo");

        System.out.print("Informe seu nome:");
        String palavra;
        Scanner entrada = new Scanner(System.in);
        palavra = entrada.next();

        System.out.println("Palavra: " + palavra);


    } 
}
