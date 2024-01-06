package listPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<>();
		num.add(1);
		num.add(24);
		num.add(78);
		
		for(int a:num)
		{
			System.out.println(a);
		}
	}

}
