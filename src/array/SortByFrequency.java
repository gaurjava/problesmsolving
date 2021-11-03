package array;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByFrequency {

	public static void main(String[] args) {

		int[] array = new int[] {2,8,2,3,4,8,8,7,4};
		System.out.println(sortFrequency(array));
	}
	
	private static List sortFrequency(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<array.length;i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i])+1);
			}else {
				map.put(array[i], 1);
			}
		}
		
		return map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
	}

}
