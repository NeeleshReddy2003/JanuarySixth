package listPractice;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> details=new HashMap<>();
		details.put("Name","Neelesh Reddy");
		details.put("DOB","March-Sixteenth");
		details.put("from","Nellore,AndhraPradesh");
		
		Set<String> key = details.keySet();
		
		for(String a : key)
		{
			System.out.println(a+"--->"+details.get(a));
			
		}
	}

}
