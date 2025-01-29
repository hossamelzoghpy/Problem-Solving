package problem_solving;

import java.util.Scanner;

public class ColorfulStones {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String color=input.next();
		String pattren=input.next();
		int counter=1;
		int pointer=0;
		for(int i=0;i<pattren.length();i++) {
			if(color.toCharArray()[pointer]==pattren.toCharArray()[i]) { //RRRBGBRBBB
				                                                         //BBBRR
				counter++;
				pointer++;
			}
		}
		System.out.println(counter);
	}

}
