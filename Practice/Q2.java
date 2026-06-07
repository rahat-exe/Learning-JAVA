

public class Q2 {
   public static void main(String[] args) {
    int count = 0;
    for(int i = 1; i<= 100; i++){
        int flag = 0;
        if(i<2) continue;
        for(int j=2; j<=i/2; j++){
            if(i%j ==  0){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            count++;
        }
    }
    System.out.println("Prime Number between 1 to 100 is "+count);
   } 
}
