import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Substring {
	// int length = 0;
	// String out;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = sc.nextLine();

		Substring st = new Substring();
		st.chksubstring(str);
		// System.out.println("Maximum-length of the subsstring is: " + res);
	}

	public void chksubstring(String inputString) {
//    	if(s==null||s.length()==0){
//            System.out.println("String contains no elements.");
//        }
//        //int result = 0;
//        //int k=0;
//    	char[] arr = s.toCharArray();
//       char ar[][]=new char[10][6];
//        for(int i=0; i<s.length(); i++){
//        	int k=0;
//        	ar[i][k]= s.charAt(i);
//        	for( int j=i+1;j<s.length();j++) {
//        		char c = s.charAt(j);
//        		//String str=Character.toString(c);
//        		if(ar[i][k]!=arr[j]){
//        			ar[i][j]=arr[j];
//        			}
//        		else {
//        			break;
//        			}
//        		}
//        	}
//        System.out.println(Arrays.deepToString(ar));
//
//
		char[] charArray = inputString.toCharArray();
		String longestSubstring = null;
		int Length = 0;
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (!lhm.containsKey(ch)) {
				lhm.put(ch, i);
			}
			else {
				i = lhm.get(ch);

				lhm.clear();
			}
			if (lhm.size() > Length) {
				Length = lhm.size();
				longestSubstring = lhm.keySet().toString();
			}
		}
		System.out.println("Input String : " + inputString);

		System.out.println("The longest substring : " + longestSubstring);

		System.out.println("The longest Substring Length : " + Length);
	}
}
