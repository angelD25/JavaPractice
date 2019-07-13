package Forloop;

public class Loopfor {

	public static void main(String[] args) {
		int[] myarray  = {1,2,3,4,5,6};
		for(int i=0;i<myarray.length;i++)
		{
			System.out.println(myarray[i]);
		}
		System.out.println("-----------------------");
		for(int element : myarray)
		{
			System.out.println(element);
		}

	}

}
