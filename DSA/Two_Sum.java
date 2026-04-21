package DSA;
import java.util.*;

public class Two_Sum {
    public static int[] twoSum(int[] arr, int n, int target) {
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++)
                { 
                if(arr[i] + arr[j] == target)
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int n, target;

        System.out.println("Enter the size of the array and the target");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        target = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = twoSum(arr, n, target);

        System.out.println(result[0] + ", " + result[1]);

        sc.close();
    }
}