package Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
public class WordsComparator implements Comparator<Map.Entry<String, Integer>>,java.io.Serializable {
	public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2){
		double a1=o1.getValue();
		double a2=o2.getValue();
		
		if(a1<a2)
			return -1;
		else if(a1==a2)
			return 0;
		else
			return 1;
	}

	
}