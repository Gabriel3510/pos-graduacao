package collections.aula05_06;


import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        ArrayList<String> linguagens = new ArrayList<>();

        linguagens.add("Pyhton");
        linguagens.add("c++");
        linguagens.add("java");

        System.out.println(linguagens);

        String[] arr = new String[linguagens.size()];

        linguagens.toArray(arr);

        System.out.println("Array: ");

        for(String item:arr){
            System.out.println(item + ", ");
        }
    }
}