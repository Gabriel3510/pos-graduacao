package estrutura_de_repeticao.aula02_05;
//while
import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        int opcao = 0;
        
        while(opcao != 99){

            System.out.println("Digite algo ou 99 para sair");
            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextInt();
        }



    }
}