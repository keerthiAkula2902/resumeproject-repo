import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class corejava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		double dec= 0.7;
		boolean success=true;
		char ch='s';
		String sh="keerthi is";
		
		System.out.println(sh +" " +success);
		
		//Arrays
		int[] arr= {10,21,34,45};
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//string arrays
		String[] str= {"akula","keerthi","is","great"};
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("******Enhanced For Loop");
		
		for(String s:str) {
			System.out.println(s);
		}
		for(int i:arr) {
			System.out.println(i);
		}
		
		//Array lists is a class
		ArrayList<String> ar = new ArrayList<String>();
	
	    ar.add("Volvo");
	    ar.add("BMW");
	    ar.add("benz");
	    ar.remove(2);
	    System.out.println("cruize present in array? "+ar.contains("cruiz"));
	    for(String ak:ar) {
	    	System.out.println(ar);
	    }
	    for(int i=0; i<ar.size();i++) {
	    	System.out.println(ar.get(i));
	    }
		
	    //converting list to arraylist
	    List<String> mylist=Arrays.asList(str);
	    mylist.add("converted");
	}

}
