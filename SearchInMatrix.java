package problem_solving;

import java.util.Scanner;

public class SearchInMatrix {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int row=input.nextInt();
		int column=input.nextInt();
		
		byte flag=0;
		int matrix[][]=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix[i][j]=input.nextInt();			
				}
		}
		int searchNum=input.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(matrix[i][j]==searchNum) {
					flag=1;
					break;
				}
			}
		}
		if(flag==1) {
			System.out.println("will not take number");
		}
		else {
			System.out.println("will take number");
		}

	}

}
