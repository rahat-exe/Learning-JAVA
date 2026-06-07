import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    int rows;
    int columns;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter rows");
    rows = sc.nextInt();
    System.out.println("Enter columns");
    columns = sc.nextInt();

    int array[][] = new int[rows][columns];

    System.out.println("enter");
    for(int i = 0; i<rows; i++){
        for(int j =0; j<columns; j++){
            System.out.println("Enter number for "+i+"and"+j);
            array[i][j] = sc.nextInt();
        }
    }

    int max = array[0][0];
    
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            if(array[i][j]>max){
                max=array[i][j];
            }
        }
    }

    System.out.println(max);

  }  
}
