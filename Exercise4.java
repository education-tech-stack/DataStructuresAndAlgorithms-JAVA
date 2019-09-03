/*
Algo-:
1. accept the value of n;
2. repeat for i vary from 1-n         --used to keep track of no. of rows
    2.1 repeat for j vary from i-(n-i)          ---print the initial blank spaces
        2.1.1 repeat for j vary from 1-i        ---print the no. from 1 to n
            2.1.1.1 repeat for j vary from (i-1)-1      ---in roeach w to print the susequent no. in the row
*/
package chapter01;
import java.util.Scanner;
/**
 *
 * @author harsh
 */
public class Exercise4 {
    public static void main(String[] args){
        int n,i,j;
        System.out.println("Enter the no. : ");
        n = Integer.parseInt(new Scanner(System.in).nextLine());
        for(i=1;i<=n;i++){
        //space
        for(j=1;j<=n-i;j++){
            System.out.println(" ");
        }
        for(j=1;j<=i;j++){
            System.out.println(j+" ");
        }
        for(j=i-1;j>0;j--){
                System.out.println(j+" ");
        }
        System.out.println();
    }
    }
}
