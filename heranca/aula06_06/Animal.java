package heranca.aula06_06;

class Animal {
    public String nome;

    public void setNome(String n){
        nome = n;
    }
    public String getNome(){
        return nome;
    }
    public void Comer(){
        System.out.println("Eu gosto de comer");
    }
}
