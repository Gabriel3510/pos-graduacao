package collections.aula03_06;

import java.util.HashSet;
import java.util.Iterator;
class Main{
    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);

        Iterator<Integer> it = numeros.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
