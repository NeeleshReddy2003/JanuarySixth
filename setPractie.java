package listPractice;

import java.util.Collection;
import java.util.Set;
import java.util.HashSet;

public class setPractie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numbers=new HashSet<>();
		numbers.add(4);
		numbers.add(21);
		numbers.add(4);
		numbers.add(66);
		numbers.add(4);
		numbers.add(90);
		numbers.add(66);
		
		for(int a:numbers)
		{
			System.out.println(a);
		}
	}

}
