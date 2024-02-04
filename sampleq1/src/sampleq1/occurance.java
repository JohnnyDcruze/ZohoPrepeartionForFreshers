package sampleq1;

import java.util.Scanner;

public class occurance {
	public static void main(String []args)
	{
		String name;
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		int count=0;
		int alphabet[]=new int[26];
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			alphabet[ch-'a']++;
		}
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(alphabet[ch-'a']>0) {
				System.out.print(ch+""+alphabet[ch-'a']);
				alphabet[ch-'a']=0;
			}
		}
	}

}
