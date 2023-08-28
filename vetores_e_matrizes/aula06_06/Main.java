package vetores_e_matrizes.aula06_06;

import java.util.ArrayList;

class Main{
    public static void main(String[] args) {

        ArrayList<String> bandas = new ArrayList<String>();

        bandas.add("kiss");
        bandas.add("beatles");
        bandas.add("ac/dc");

        System.out.println(bandas);

        bandas.add(bandas.indexOf("kiss"), "teste");

        System.out.println(bandas);

        bandas.remove("kiss");

        System.out.println(bandas);

        bandas.clear();
        System.out.println(bandas);

    }
}
