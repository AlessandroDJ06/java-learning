package RekenenMetMatrices;

public class Vermenigvuldiging {
    public static void main(String[] args) {

        int[][] first = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] second = { {4, 5, 6}, {7, 8, 9}, {1, 2, 3} };

        int[][] result = new int[first.length][second.length];

        for(int i = 0; i < first.length ; i++) {
            for (int j = 0; j < first.length; j++) {
                for (int k = 0; k < first.length; k++){
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }


        for (int i = 0; i < result.length;i++){
            for (int j = 0 ; j < result.length ; j++){
                System.out.print(result[i][j]+" ");
                if (j == result.length-1){
                    System.out.println();
                }
            }
        }

        System.out.println();

        for (int[] ints : result) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(ints[j] + " ");
                if (j == result.length - 1) {
                    System.out.println();
                }
            }
        }




    }
}
