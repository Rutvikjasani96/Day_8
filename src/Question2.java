public class Question2 {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        array[0][0] = 3;
        array[0][1] = 8;
        array[0][2] = 9;
        array[0][3] = 2;
        array[1][0] = 1;
        array[1][1] = 2;
        array[1][2] = 3;
        array[1][3] = 6;
        array[2][0] = 4;
        array[2][1] = 10;
        array[2][2] = 11;
        array[2][3] = 17;
        int sum;
        for(int i =0 ; i < 4;i++){
            sum=0;
            for(int j=0;j<3;j++){
                sum = sum + array[j][i];
            }
            System.out.println(" "+sum);
        }
    }
}
