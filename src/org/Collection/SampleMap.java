package org.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SampleMap {
	public static void main(String[] args) {
		
	
Map<Integer, String> mp=new HashMap<Integer, String>();
mp.put(01, "Karthik");
mp.put(02, "Tamil");
mp.put(03, "Nirai");
mp.put(04, "xyz");
Set<Entry<Integer,String>> e= mp.entrySet();
for (Entry<Integer, String> entry : e) {
	System.out.println(entry.getValue());
	System.out.println(entry.getKey());
	
}
System.out.println(e);
String remove = mp.remove(04);
System.out.println("AFTER REMOVED =="+remove);
String getkey = mp.get(02);
System.out.println(getkey);
Set<Integer> keys = mp.keySet();
System.out.println(keys);
Collection<String> values = mp.values();
System.out.println(values);
boolean containsKey = mp.containsKey(05);
System.out.println(containsKey);
boolean containsValue = mp.containsValue("Tamil");
System.out.println(containsValue);
//mp.clear();
System.out.println(mp);
mp.put(05, "chumma");
System.out.println(mp);


}
}