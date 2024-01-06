public class Question4 {
//    Given mat[n][n], print all diagonals going R-L.
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        array[0][0] = 3;
        array[0][1] = 8;
        array[0][2] = 9;
        array[0][3] = 10;
        array[1][0] = 1;
        array[1][1] = 2;
        array[1][2] = 3;
        array[1][3] = 8;
        array[2][0] = 4;
        array[2][1] = 10;
        array[2][2] = 11;
        array[2][3] = 12;

//        print diagonals starting from 0th index row.
        for(int k=0;k<array[0].length;k++) {
            int i = 0, j = k;
            while (i < array.length && j >= 0) {
                System.out.println(array[i][j]);
                i++;
                j--;
            }
        }
//        print all diagonals start from m-1th column.
        for(int k=1;k< array.length;k++){
            int i = k,j=array[0].length-1;
            while(i<array.length && j>=0){
                System.out.println(array[i][j]);
                i++;
                j--;
            }
        }
    }
}
