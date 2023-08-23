package estrutura_de_repeticao.aula03_05;
//do/while
import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        int opcao;
        
        do{
            System.out.println("Digite algo ou 99 pra sair");
            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextInt();
        }while(opcao != 99);

    }
}