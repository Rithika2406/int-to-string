import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        String s=Integer.toString(n);
        if(s.equals(Integer.toString(n)))
        {
            System.out.println("Good job");
        }
        else
        {
            System.out.println("Wrong answer");
        }
    }
}