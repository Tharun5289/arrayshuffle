import java.util.*;

class Main
{
	public static void main(String args[])
	{	
		int a[] = {1,2,3,4,5,6,7};
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int element : a)
		{
			arrayList.add(element);
		}
		Collections.shuffle(arrayList);
		System.out.println(arrayList);
	}
}