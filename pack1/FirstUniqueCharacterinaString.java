import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
    
	LinkedHashMap<Character, Integer> hm;
	hm = new LinkedHashMap<Character, Integer>();
	
	for(int index = 0; index<s.length(); index++) {
		char ch = s.charAt(index);
		if(hm.containsKey(ch)) {
			int prevcount = hm.get(ch);
			hm.put(ch, prevcount+1);
		}else {
			hm.put(ch, 1);
		}
	}
	Set<Entry<Character, Integer>> set = hm.entrySet();
	char uniquechar = ' ';
	Iterator<Entry<Character, Integer>> it1;
	it1 = set.iterator();
	while(it1.hasNext()) {
		Entry<Character, Integer> entry = it1.next();
		if(entry.getValue() == 1) {
			uniquechar = entry.getKey();
			break;
		}
	}
	
// System.out.println(hm);
// System.out.println(uniquechar);
// System.out.println(s.indexOf(uniquechar));
return s.indexOf(uniquechar);
        }
    }
