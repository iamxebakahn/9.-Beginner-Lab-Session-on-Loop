/*Problem Description

Take an integer A as input. You have to print the sum of all odd numbers in the range [1, A].


Problem Constraints

1 <= A <= 1000



Input Format

First and only line contains a single positive integer A.



Output Format

Print the required sum in a single line.


Example Input

Input 1:




 1 
Input 2:

 4 





Example Output

Output 1:




 1 
Output 2:

 4  */
import java.lang.*;
import java.util.*;

public class Q1AP_Beginner_Lab_Session_on_Loop{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N%2==0)
            N=N-1;
        int sum=0;
        for(int i=1;i<=N;i=i+2)
            sum+=i;
        System.out.print(sum);
    }
}