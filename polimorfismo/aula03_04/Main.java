package polimorfismo.aula03_04;

class Linguagem{
    public void mostrarInfo(){
        System.out.println("Lingua portuguesa");
    }
}

class Java extends Linguagem{
    public void mostrarInfo(){
        System.out.println("Linguagem java");
    }
}

class Main{
    public static void main(String[] args) {
        //criar um obj da lingauem java
        Java j = new Java();
        j.mostrarInfo();

        Linguagem l = new Linguagem();
        l.mostrarInfo();


    }
}
