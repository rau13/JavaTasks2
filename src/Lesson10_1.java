public class Lesson10_1 {
    public static void main(String[] args){
        int[][] twoDimmmenArray = new int [2][2];

        twoDimmmenArray[0][0] = 0;
        twoDimmmenArray[0][1] = 1;
        twoDimmmenArray[1][0] = 2;
        twoDimmmenArray[1][1] = 3;

        for (int i = 0; i<2; i++){
            for (int j=0;j<2; j++){
                System.out.print(twoDimmmenArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
