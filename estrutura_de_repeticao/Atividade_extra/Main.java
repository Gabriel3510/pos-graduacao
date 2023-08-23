package estrutura_de_repeticao.Atividade_extra;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
            int i = 1;
            String nome[] = new String[5];
            for(i = 1; i <= 5; i++){
                System.out.println("Digite o " + i + " filme: ");
                Scanner entrada = new Scanner(System.in);
                nome[i] = entrada.next();  
            }
            for(i = 1; i <= 5; i++){
                System.out.println("O filme é " + nome[i]);
            }

    }
}
