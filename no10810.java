import java.util.Scanner;

public class no10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for(int j=a-1; j<b; j++){
                arr[j] = c;
            }
        }
        for(int k=0; k<m ; k++){
            System.out.print(arr[k]+" ");
        }
//        5 4
//        1 2 3
//        3 4 4
//        1 4 1
//        2 2 2
//
//        1 2 1 1 0
    }
}