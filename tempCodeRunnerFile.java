 import java.util.Scanner;
public class emax {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max = sc.nextInt();
    for(int i=0;i<n;i++)
    {
        int x = sc.nextInt();
        if(x>max){
            max = x;
        }
        System.out.print(max);
    }
  }
}