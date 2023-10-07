import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int res = 0;
        int[][] quadMatrix = new int[n][n];
        for (int i = 0; i < quadMatrix.length; i++) {
            for (int j = 0; j < quadMatrix[i].length; j++) {
                quadMatrix[i][j] = (int) (Math.random()*10);
            }

        }
        for (int i = 0; i < quadMatrix.length; i++) {
            for (int j = 0; j < quadMatrix[i].length; j++) {
                System.out.print(quadMatrix[i][j] + " ");

            }
            System.out.println();
        }

        //ниже вычисление следа матрицы в структурной парадигме
        for (int i = 0; i < quadMatrix.length; i++) {
            for (int j = 0; j < quadMatrix[i].length; j++) {
                if (i == j)
                    res = res + quadMatrix[i][j];
            }
        }
        System.out.println("Результат от структурной парадигмы");
        System.out.println(res);

        matrixTrace(quadMatrix);

    }


    public static void matrixTrace(int [][] quadMatrix){
        //вычисление следа матрицы в процедурной парадигме
        int res = 0;
        for (int i = 0; i < quadMatrix.length; i++) {
            for (int j = 0; j < quadMatrix[i].length; j++) {
                if (i == j)
                    res = res + quadMatrix[i][j];
            }
        }
        System.out.println("Результат от процедурной парадигмы");
        System.out.println(res);
    }


}