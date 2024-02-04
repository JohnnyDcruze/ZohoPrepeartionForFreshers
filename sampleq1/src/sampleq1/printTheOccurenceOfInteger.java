package sampleq1;

import java.util.Arrays;

public class printTheOccurenceOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {4,1,2,3,4,4,3,2,2,3,1,1,1,5};
		Arrays.sort(array);
		int j=0,count=1;
		for(int i=1;i<array.length;i++)
		{
			if(array[i]!=array[j])
			{
				System.out.println(array[j]+"-"+count);
				j=i;
				count=1;
			}
			else
				count++;
		}
		System.out.println(array[j]+"-"+count);
	}

}
