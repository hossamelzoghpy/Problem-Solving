package problem_solving;

import java.util.Scanner;

public class YaroslavAndPermutations {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		 int size=input.nextInt();
		 int arr[]=new int[size];
		 
		 int result=0;
		 for(int i=0;i<size;i++) {
			 arr[i]=input.nextInt();
		 }
		 
		 for(int i=0;i<size;i++) {
			 int counter=0;
			for(int x=0;x<size;x++) {
				if(arr[i]==arr[x]) {
					counter++;
				}
			}
			if(result<counter) {
				result=counter;
			}
		 }
		 if(size%2==0) {
			 if(result<=(size/2)) {
				 System.out.println("YES"); 
			 }
			 else {
				 System.out.println("NO");
			 }
		 }
		 else {
			 if(result<=((size/2)+1)) {
				 System.out.println("YES"); 
			 }
			 else {
				 System.out.println("NO");
			 }
		 }
		 

	}

}
