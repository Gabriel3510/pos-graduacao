package aula05_06;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma opcao: ");
        System.out.println("1- Cadastrar aluno");
        System.out.println("2- Cadastrar notas:");
        System.out.println("3- Listar alunos e nota:");

        int numero = entrada.nextInt();

        switch(numero){
            case 1:
                System.out.println("Vamos cadastrar o aluno");
            break;
            case 2:
                System.out.println("Vamos cadastrar notas");
            break;
            case 3:
                System.out.println("Listar alunos");
            break;
            default:
                System.out.println("O numero é invalido");

        }

    }
}
