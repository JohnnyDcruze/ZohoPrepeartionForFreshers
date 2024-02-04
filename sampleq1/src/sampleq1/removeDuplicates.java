package sampleq1;

import java.util.Arrays;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,1,1,2,2,3,3,4};
		int j=0;
		for(int i=1;i<array.length;i++)
		{
			if(array[i]!=array[j])
			{
				j++;
				array[j]=array[i];
			}
			
		}
		for(int i=0;i<=j;i++)
		{
			System.out.print(array[i]);
		}

	}

}
