package problem_solving;

import java.util.Scanner;

public class Pum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		for(int i=1;i<=number*4;i++) {
			if(i%4==0) {
				System.out.print("PUM" + "\n");
				continue;
			}
			System.out.print(i+ " ");
		}
	}

}
