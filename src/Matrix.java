public class Matrix {
    public static void main(String[] args) {

        int[][] matrix = new int[10][10];
        int sum=0;

        for (int i = 0; i < matrix.length; i++){
        for (int j= 0; j< matrix.length; j++){
            if(i == j){
                matrix[i][i] = i;
                sum+= matrix[i][i];
            }
            System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Sum of elements on the diagonal: " + sum);
        }
    }

