/*Q3. Multiples of 4
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description
Given an integer input N, print all multiples of 4 less than or equal to N.

Problem Constraints

1 <= N <= 10000


Input Format

Single line containing an integer N.


Output Format

Space separated integers representing multiples of 4 less than or equal to N.


Example Input

22


Example Output

4 8 12 16 20


Example Explanation

1 * 4 = 4
2 * 4 = 8
3 * 4 = 12
4 * 4 = 16
5 * 4 = 20

All are multiples of 4 less than 22 */
import java.lang.*;
import java.util.*;

public class Q3_Beginner_Lab_Session_on_Loop{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
         
        for (int i=4;i<=N;i=i+4)
            System.out.print(i+" ");

    }
}