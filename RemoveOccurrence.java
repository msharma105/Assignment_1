import java.util.HashMap;
import java.util.Map;

public class RemoveOccurrence {

	public static void main(String[] args) {
		String s = "AABCADDEDEFE";
		StringBuffer sb = new StringBuffer();
		int n = s.length();
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i < n; i++) {
			if (mp.containsKey(s.charAt(i))) {
				if (!(mp.get(s.charAt(i)) + 1 >= 3)) {
					mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
					sb.append(s.charAt(i));
				}
			} else {
				mp.put(s.charAt(i), 1);
				sb.append(s.charAt(i));
			}
		}
		System.out.print(sb);
	}
}
