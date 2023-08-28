package introducao_POO.aula06_06;

class Main{
    public static void main(String[] args) {

        Cao cachorro = new Cao();
        cachorro.setIdade(5);

        if(cachorro.VericarIdade() == true){
            System.out.println("Ele é idoso");
        }else {
            System.out.println("é novo");
        }


    }
}