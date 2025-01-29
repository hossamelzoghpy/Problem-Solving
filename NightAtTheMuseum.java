package problem_solving;

import java.util.Scanner;

public class NightAtTheMuseum {

	public static void main(String[] args) {//car
		Scanner input=new Scanner(System.in);
		String name=input.next();
		int moves=0;
		int start=97;
		for(int i=0;i<name.length();i++) {
			int result=Math.abs(name.toCharArray()[i]-start);
			if(result<=13) {
				moves+=result;
			}
			else {
				moves+=(26-result);
			}
				
			start=name.toCharArray()[i];
		}
		System.out.println(moves);

	}

}
