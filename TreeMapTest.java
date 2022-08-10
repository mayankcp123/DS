
import java.util.HashMap;
import java.util.Map.Entry;


public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<Integer, String> dictionary = new HashMap<Integer,String>();
			dictionary.put(101, "ready to face and endure danger or pain; showing courage.");
			dictionary.put(102, "clever or talented");
			dictionary.put(103, "a feeling of great pleasure.");
			dictionary.put(104, "certain about truth");
			
//			for(String word: dictionary.keySet()){
//				System.out.println(dictionary.get(word));
//			}
			for(Entry<Integer, String> entry :dictionary.entrySet()) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}
	}

}