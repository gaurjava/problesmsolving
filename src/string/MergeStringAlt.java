package string;

public class MergeStringAlt {

	public static void main(String[] args) {
		String s1= "hello";
		String s2 ="bhupesh";
		System.out.println(mergeString(s1, s2));
	}

	private static String mergeString(String s1, String s2) {
		
		StringBuilder rs = new StringBuilder();
		
		for(int i=0;i<s1.length() || i< s2.length(); i++) {
			if(i<s1.length()) {
				rs.append(s1.charAt(i));
			}
			
			if(i<s2.length()) {
				rs.append(s2.charAt(i));
			}
		}
		return rs.toString();
	}
}
