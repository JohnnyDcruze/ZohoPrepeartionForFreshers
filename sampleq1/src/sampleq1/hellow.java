package sampleq1;
import java.util.*;
public class hellow {
	public static void main(String []args) {
		String name1="abcdefghijkl";
		String name2="abdcefhgijll";
		char array1[]=name1.toCharArray();
		char array2[]=name2.toCharArray();
		String value1="";
		String value2="";
		for(int i=0;i<name1.length();i++)
		{
			if(array1[i]!=array2[i])
			{
				value1+=array1[i];
				value2+=array2[i];	
			}
			if(array1[i]==array2[i]&&value1!=""&&value2!="")
			{
				value1+=",";
				System.out.print(value1);
				System.out.println(value2);
				value1="";
				value2="";
			}
		}
		
	}

}
