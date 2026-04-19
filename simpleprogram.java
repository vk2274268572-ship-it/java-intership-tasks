package Tasks_one;
import java.lang.reflect.Array;
import java.util.Scanner;
public class simpleprogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the element of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array element are:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

        }
        System.out.println("The sum of arrray element is" +sum);
        if(sum > 50){
    System.out.println("Sum is greater than 50");
} else {
    System.out.println("Sum is less or equal to 50");
}

    }
}
