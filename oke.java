package listPractice;

import java.util.ArrayList;
import java.util.Collection;

public class oke {

	public static void main(String[] args) {
		Collection num=new ArrayList();
		num.add(23);
		num.add("Neelesh Reddy");
		num.add(66);
		
		for(Object a : num)
		{
			System.out.println(a);
		}

	}

}
