package collections;
import java.util.*; 
public class Search {
	 
	    public static void main(String[] args) 
	    { 
	        List<String> l = new ArrayList<String>(5); 
	        l.add("abc"); 
	        l.add("hello"); 
	        l.add("good"); 
	        System.out.println("first index of abc:"
	                           + l.indexOf("abc")); 
	        System.out.println("last index of abc:"
	                           + l.lastIndexOf("abc")); 
	        System.out.println("Index of element"
	                           + " not present : "
	                           + l.indexOf("Hello")); 
	    } 
	} 
