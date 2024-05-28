import java.util.Scanner;

public class fabonici {
    public static void main(String[] args) {
        int n, firstTerm = 0 , secondTerm = 1;
        System.out.println("enter term ");
          
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        for(int i = 1; i<=n; i=i+1) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
    
}
