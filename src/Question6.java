public class Question6 {
//    Given a square matrix, rotate by 90 in clock wise from top right as a reference, inplace.
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;
        array[0][4] = 5;
        array[1][0] = 6;
        array[1][1] = 7;
        array[1][2] = 8;
        array[1][3] = 9;
        array[1][4] = 10;
        array[2][0] = 11;
        array[2][1] = 12;
        array[2][2] = 13;
        array[2][3] = 14;
        array[2][4] = 15;
        array[3][0] = 16;
        array[3][1] = 17;
        array[3][2] = 18;
        array[3][3] = 19;
        array[3][4] = 20;
        array[4][0] = 21;
        array[4][1] = 22;
        array[4][2] = 23;
        array[4][3] = 24;
        array[4][4] = 25;
        Question5.transposeArray(array);
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){
                swapArrayEle(array,i,j, array.length-1-j);
                if(array.length-1-j<=j){
                    break;
                }
            }
        }
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    }
    static void swapArrayEle(int[][] array,int i,int j,int k){
        int temp = array[i][j];
        array[i][j] = array[i][k];
        array[i][k] = temp;
    }
}
