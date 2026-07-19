import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        
        int sum = a;

        for(int j=0; j<n; j++){
            int mm =(int) (b * Math.pow(2, j));  // 2^j
            sum = sum + mm;

            System.out.print(sum + " ");
        }
        System.out.println();
        }
        in.close();
    }
}