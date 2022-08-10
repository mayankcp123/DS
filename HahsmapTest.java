import java.util.HashMap;
import java.util.Map.Entry;


public class HahsmapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<String, String> dictionary = new HashMap<String,String>();
			dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
			dictionary.put("Brilliant", "clever or talented");
			dictionary.put("Joy", "a feeling of great pleasure.");
			dictionary.put("Confidence", "certain about truth");
			
//			for(String word: dictionary.keySet()){
//				System.out.println(dictionary.get(word));
//			}
			for(Entry<String, String> entry :dictionary.entrySet()) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}
	}

}
