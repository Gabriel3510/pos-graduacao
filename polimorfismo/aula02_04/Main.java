package polimorfismo.aula02_04;

class Desenho{
    //metodo sem parametro
    public void mostrar(){
        for(int i=0; i<10; i++){
            System.out.println("*");
        }
    }
    //metodo com parametro 
    public void mostrar(char simb){
        for(int i=0; i<10; i++){
            System.out.println(simb);
        }
    }
    //metedo com dois parametros
    public void mostrar(char simb, int n){
        for(int i=0; i<n; i++){
            System.out.println(simb);
        }
    }
}

class Main{
    public static void main(String[] args) {
        Desenho d = new Desenho();
        d.mostrar();
        d.mostrar('#');
        d.mostrar('&', 3);

    }
}
