package heranca.aula03_06;

public class Poupanca extends Conta{

    public void imprimeExtrato(){
        System.out.println("Saldo da conta: " + this.getSaldo());
    }
    
}
