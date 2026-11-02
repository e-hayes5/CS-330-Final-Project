import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class RandomIntegers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] A = new int[n];

        for(int i=0; i<=n-1; i++){
            A[i] = random.nextInt(4*n)+1;
        }

        boolean hasDuplicates = true;
        while(hasDuplicates){
            hasDuplicates = false;
            for(int i=0; i<=n-1; i++){
                for(int j=i+1; j<=n-1; j++){
                    if(A[i] == A[j]){
                        A[j] = random.nextInt(4*n)+1;
                        hasDuplicates = true;
                    }
                }
            }
        }
        int comparisons=0;
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i+1; j<=n-1;j++){
                comparisons++;
                if(A[j]< A[min]){
                    min = j;
                }
            }
            int temp = A[i];
            A[i] = A[min];
            A[min] = temp;   
        }
    System.out.println(Arrays.toString(A));
    System.out.println("Basic Operation Count: " + comparisons);
    scanner.close();
 }
}
