import java.util.Scanner;
public class Divisible_by_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;
        int sum=0;
        System.out.println("Enter array elements");
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    sum = a[i]%10 + a[i]/10;
                    if(sum % 3==0)
                        count++;
            }
                System.out.println(count);
        }
        else
            System.out.println("enter a valid array size");
    }
}

