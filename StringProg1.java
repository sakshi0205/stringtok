package day9;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringProg1 {
          public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter lines of numbers: ");
			String input=sc.next();
			sc.close();
			StringTokenizer s=new StringTokenizer(input,"-");
			int sum=0;
			while(s.hasMoreElements()){
				int num=0;
				num=Integer.parseInt(s.nextToken());
				System.out.println("Number is: "+num);
				sum+=num;
			}
		}
}
