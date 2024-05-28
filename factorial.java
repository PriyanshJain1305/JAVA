import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n , i,factorial=1;
        System.out.println("Enter any number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        for(i=1; i <= n; i=i+1)
        {
            factorial=factorial*i;
        }
        System.out.println("factorial is " + factorial);

    }
}
