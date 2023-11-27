import java.util.Scanner;

public class no2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b&&a==c){
            System.out.println(10000+a*1000);
        }else if(a==b){
            System.out.println(1000+a*100);
        }else if(a==c){
            System.out.println(1000+a*100);
        }else if(b==c){
            System.out.println(1000+b*100);
        }else{
            int mx = Math.max(a,b);
            int mxx = Math.max(mx,c);
            System.out.println(mxx*100);
        }
    }

}
