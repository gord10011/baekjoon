import java.util.Scanner;

public class no25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;
        for(int i = 0; i<b; i++){
            int c = sc.nextInt();
            int d = sc.nextInt();

            total += c*d;
        }
        if(total==a){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
