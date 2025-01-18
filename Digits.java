package problem_solving;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		
		for(int i=0;i<size;i++) {
			int num=input.nextInt();
			if(num==0) {
				System.out.println(0);
				continue;
			}
			while(num!=0){
				int numSplit=num%10;
				System.out.print(numSplit+" ");
				num/=10;
			}
			System.out.println();
			
		}
		

	}

}
