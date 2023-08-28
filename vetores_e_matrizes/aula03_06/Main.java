package vetores_e_matrizes.aula03_06;

class Main{
    public static void main(String[] args) {
        int[] birdPorDia = {2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1};
        int totalbird = 0;
        int birdPrimaira = 0;
        int birdSegunda = 0;

        for(int i = 0; i<14; i++){
            totalbird = totalbird + birdPorDia[i];

        }
        System.out.println(totalbird);

        for(int i = 0; i<7; i++){
            birdPrimaira = birdPrimaira + birdPorDia[i];

        }
        System.out.println(birdPrimaira);

        for(int i = 7; i<14; i++){
            birdSegunda = birdSegunda + birdPorDia[i];

        }
        System.out.println(birdSegunda);
    }
}