package vetores_e_matrizes.aula05_06;

import java.util.ArrayList;

class Main{
    public static void main(String[] args) {

        ArrayList<String> estados = new ArrayList<>();

        estados.add("Sao paulo");
        estados.add("Rio de janeiro");
        estados.add("Brasilia");
        estados.add("Amazonas");

        System.out.println(estados);

        estados.remove("Sao paulo");

        System.out.println(estados);

        estados.contains("Amazonas");

        


    }
}
