import java.util.Scanner;

public class Q8 {
  public static void main(String[] args) {
    int length;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the length of the array?");
    length = sc.nextInt();

    int arr[] = new int[length];
    System.out.println("Enter elements of the array?");
    for(int i = 0; i<length; i++){
        System.out.println(i);
        arr[i] = sc.nextInt();
    }

    for(int i = 0; i<length; i++){
        int count = 1;
        if(arr[i] == -1) continue;

        for(int j = i+1; j<length; j++){
            if(arr[i] == arr[j]){
                count++;
                arr[j] = -1;
            }
        }
        System.out.println("Frequency of "+arr[i]+" is "+count);
    }
  }  
}
