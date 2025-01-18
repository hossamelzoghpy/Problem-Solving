package problem_solving;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		long num=input.nextLong();
		if(num == 1) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}

	}

}
