import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        int[] arr1 = new int[5];
        arr1[0] = 10;

        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // int[] arr3 = new int[10];
        // System.out.println("Enter 10 arrays elements?");
        Scanner sc = new Scanner(System.in);
        // for(int i = 0; i< 10; i++){
        //     arr3[i] = sc.nextInt();
        // }
        // for(int i = 0; i< 10; i++){
        //     System.out.print(arr3[i]+" ");
        // }
        // for (int num : arr3) {
        //     System.out.print(num + " ");
        // }

        // int[][] Arr2d = {{1,2,3},{4,5,6},{3,4,5}};

        // for(int i = 0; i<Arr2d.length; i++){
        //     for(int j=0; j<Arr2d[i].length; j++){
        //         System.out.print(Arr2d[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Take input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print matrix
        System.out.println("Your Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        } 
    }

    int[] sdfghj = new int[10];
    int[][] dfghjk = new int[3][5]
}
