package problem_solving;

import java.util.Scanner;

public class SummationFrom1ToN {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		long sum=((long)num*(num+1))/2;
		System.out.println(sum);
	}

}
