package Test_Cases;

import java.util.LinkedList;

public class data {

	public Object data(int ind) {

		LinkedList<String> e = new LinkedList<String>();

	
		
		e.add("");
		e.add("bhalerao.r.atul@gmail.com");
		
		

		Object x = e.get(ind);
		return x;

	}

	public static void main(String[] args) {

		data d = new data();

		System.out.println(d.data(2));

	}

}
