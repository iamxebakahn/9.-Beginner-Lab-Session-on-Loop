/*Problem Description

Write a program to print all even numbers from N to 0 where you have to take N as input from the user.


Problem Constraints

1 <= N <= 1000000


Input Format

A single line representing N.


Output Format

All even numbers from N to 0 are separated by spaces.


Example Input

Input 1:
5

Input 2:
10


Example Output

Output 1:
4 2 0

Output 2:
10 8 6 4 2 0


Example Explanation

Explanation 1:
N = 5, all even numbers from 5 to 0 are : 4 2 0

Explanation 2:
N = 10, all even numbers from 10 to 0 are : 10 8 6 4 2 0 */
import java.lang.*;
import java.util.*;

public class Q4_Beginner_Lab_Session_on_Loop{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%2!=0)
            N=N-1;
         
        for (int i=N;i>=0;i=i-2)
            System.out.print(i+" ");
    }
}