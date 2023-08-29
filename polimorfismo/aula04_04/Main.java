package polimorfismo.aula04_04;

class Main{
    public static void main(String[] args) {


        String primeira = "java";
        String segunda = "java";
        String terceira = new String("C++");

        System.out.println(primeira.toUpperCase());
        System.out.println(segunda.length());
        System.out.println(terceira);

        //comparar a primeira com a segunda
        boolean result = primeira.equals(segunda);
        System.out.println(result);
    }
}