import java.util.Scanner;

public class no25314 {
    public static void main(String[] args) {
        // 4의 배수 long int
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a/4;
        StringBuilder c = new StringBuilder();
        for(int i = 0; i<b; i++){
            c.append("long ");
        }
        c.append("int");
        System.out.println(c);
    }
}
