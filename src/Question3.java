public class Question3 {
//    print Diagonals. L-R R-L
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
        printLtoR(array);
        printRtoL(array);
    }
    static void printLtoR(int[][] array){
        for(int i=0;i< 3;i++){
            System.out.println(array[i][i]);
        }
    }
    static void printRtoL(int[][] array){
        int i = 0,j= array.length;
        while(i< array.length && j>=0){
            i++;
            j--;
            System.out.println(array[i][j]);
        }
    }
}
