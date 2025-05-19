/*Problem Description

You have a number N, you have to write a code to find odd digit sum and even digit sum from given number and print it.


Problem Constraints

0 < N < 1000000000


Input Format

An Integer N


Output Format

In first line, print ("Sum of Odd Digit : x"), x is sum of odd digits
In second line, print ("Sum of Even Digit : y"), y is sum of even digits


Example Input

Input 1 :
8563724

Input 2 :
4524126


Example Output

Output 1 :
Sum of Odd Digit : 15
Sum of Even Digit : 20

Output 2 :
Sum of Odd Digit : 6
Sum of Even Digit : 18 */
import java.lang.*;
import java.util.*;

public class Q3AP_Beginner_Lab_Session_on_Loop{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int odd_sum=0, even_sum=0, digit;
        if(N>=0 && N<=9)
            System.out.print(N);
        while(N>0)
        {
            digit=N%10;
            if(digit%2==0)
                even_sum+=digit;
            else
                odd_sum+=digit;
        
            N/=10;
        }
        System.out.println("Sum of Odd Digit : "+ odd_sum);
        System.out.println("Sum of Even Digit : "+ even_sum);
    }
}