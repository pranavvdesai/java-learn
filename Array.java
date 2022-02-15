import java.util.*;
public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[][] a = new int[3][];
        a[0] = new int[2];
        a[1] = new int[3];
        
    }
}
