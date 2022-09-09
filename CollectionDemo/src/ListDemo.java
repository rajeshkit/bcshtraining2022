import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo{
	public static void main(String[] args) {
		List<String> list=null;
		list=new ArrayList<String>();
		list.add("Pune");
		list.add("Mumbai");
		list.add("chennai");
		list.add("Hydrabad");
		
		list=new LinkedList<String>();
		list.add("Pune");
		list.add("Mumbai");
		list.add("chennai");
		list.add("Hydrabad");
		
		list=new Vector<String>();
		list.add("Pune");
		list.add("Mumbai");
		list.add("chennai");
		list.add("Hydrabad");
		
	
		
	}
}
