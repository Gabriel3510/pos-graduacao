package vetores_e_matrizes.aula02_06;
//matriz
class Main{
    public static void main(String[] args) {
        int valor;
        int[][] dados = new int[5][5];

        //dados[0][0] = 1;
        //dados[0][2] = 2;

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                dados[i][j] = j;

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                System.out.println(dados[i][j]);
    }
}