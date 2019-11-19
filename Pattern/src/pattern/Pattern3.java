package pattern;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,j,k;
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(i=0;i<=n;i++)
		{
			for(j=n-i;j>1;j--)
			{
				System.out.printf(" ");		
			}
			for(k=1;k<=i;k++)
			{
				if(i%2!=0)
				{
				System.out.printf("* ");		
			   }
			}
			System.out.println();	
		
		}
	
}
	
	
}


