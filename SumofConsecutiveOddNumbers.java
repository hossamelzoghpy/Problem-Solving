package problem_solving;

import java.util.Scanner;

public class SumofConsecutiveOddNumbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sizeNum=input.nextInt();
		
		for(int i=0;i<sizeNum;i++) {
			int sum = 0;
			int num1=input.nextInt();
			int num2=input.nextInt();
			int max=Math.max(num1, num2);
			int min=Math.min(num1, num2);
			for(int x=min+1;x<max;x++) {
				if(x%2!=0) {
					sum+=x;
				}
			}
			System.out.println(sum);
		}
		

	}

}
