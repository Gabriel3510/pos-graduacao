package collections.aula04_06;

import java.util.TreeSet;

class Main{
    public static void main(String[] args) {

        TreeSet<Integer> numeros = new TreeSet<>();


        numeros.add(8);
        numeros.add(6);
        numeros.add(9);

        System.out.println(numeros);

        boolean result = numeros.remove(61);

        System.out.println(result);


    }
}