import java.util.Scanner;

public class no10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int cnt = 0;
        int[] b = new int[a];

        for(int i = 0; i<a; i++){
            b[i]+=sc.nextInt();
        }

        int c = sc.nextInt();

        for(int i = 0; i<b.length; i++){
            if(b[i]==c){
                cnt++;
            }
        }
        System.out.println(cnt);
        // 11
        // 1 2 3 4 5 5 4 3 2 1 1
        // 1
        // 3
    }
}
