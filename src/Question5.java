public class Question5 {
//    Given a mat[n][n], find the transpose inplace given input mat[][] should update.
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 3;
        array[0][1] = 8;
        array[0][2] = 9;
        array[1][0] = 1;
        array[1][1] = 2;
        array[1][2] = 3;
        array[2][0] = 4;
        array[2][1] = 10;
        array[2][2] = 11;
        transposeArray(array);
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    }
    static void transposeArray(int[][] array){
        for(int i=0;i< array.length;i++){
            for(int j = i+1;j< array.length;j++){
                swapArrayEle(array,i,j);
            }
        }
    }
    static void swapArrayEle(int[][] array,int i,int j){
        int temp = array[i][j];
        array[i][j] = array[j][i];
        array[j][i] = temp;
    }
}
