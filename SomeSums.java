package problem_solving;

import java.util.Scanner;

public class SomeSums {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int size1=input.nextInt();
		int size2=input.nextInt();
		int totalSum=0;
		for(int i=1;i<=num;i++) {
			int digit=i;
			int sum=0;
			while(digit!=0) {
				int newNum = digit % 10;
				sum+=newNum;
				digit/=10;
			} 
			if(sum>= size1 && sum <=size2) {
				totalSum+=i;
			}
		}
		System.out.println(totalSum);
		

	}

}
