package pattern;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,j,k=0;
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
			System.out.printf("%c ",k+65);
			k++;
			}
			System.out.println();

		}
	}

}
