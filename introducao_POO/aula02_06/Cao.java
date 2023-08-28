package introducao_POO.aula02_06;

public class Cao {
    String nome, cor;
    int idade;
    double peso;

    public Cao(){
        cor = "amarelo";
    }
    public Cao(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    private void Anda(){
        System.out.println("Estou andando...." + cor);
    }

    private void Dadoscao(){
        System.out.println(nome + " " + idade);
    }
}
