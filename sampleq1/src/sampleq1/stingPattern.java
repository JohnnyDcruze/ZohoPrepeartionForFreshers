package sampleq1;
import java.util.*;
public class stingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int j=name.length()-1;
		for(int i=0;i<name.length();i++)
		{
			for(int k=0;k<name.length();k++)
			{
				if(k==i||k==j)
					System.out.print(name.charAt(k)+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
			j--;
		}

	}

}
