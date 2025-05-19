/*Problem Description

You take an integer N as input. Your task is to calculate and print the sum of the digits of the given number N.


Problem Constraints

0 <= N <= 109


Input Format

The first line contains an integer N.


Output Format

Print an Integer, denoting the sum of the digits of the input integer.


Example Input

Input 1:
5
Input 2:
123
Input 3:
1589


Example Output

Output 1:
5
Output 2:
6
Output 3:
23
 */
import java.lang.*;
import java.util.*;

public class Q5_Beginner_Lab_Session_on_Loop{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0,digit;
        if(N<9)
            sum=sum+N;
        else
            {
                while(N>0)
                {
                  digit=N%10;
                  sum+=digit;  
                  N/=10;
                }
            }
        System.out.print(sum);

    }
}