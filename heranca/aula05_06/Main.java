package heranca.aula05_06;
import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);


        try{
            System.out.println("Digite um valor");
            int numero1 = s.nextInt();
            System.out.println(numero1);
        }catch(Exception ex){
            System.out.println("Erro digite um numero");
        }
    }
}
