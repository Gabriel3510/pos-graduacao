package collections.aula02_06;

import java.util.LinkedList;

class Main{
    public static void main(String[] args) {

        LinkedList<String> animais = new LinkedList<>();

        animais.add("cao");
        animais.add("vaca");
        animais.add("cavalo");

        System.out.println("linkedlist " + animais);

        animais.add(1, "Gato");
        System.out.println("linkedlist " + animais);

    }
}
