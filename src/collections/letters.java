package collections;
   import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	public class letters {
		public static void main(String[] args) {

			List<String> letters = new ArrayList<String>();

			letters.add("A");
			letters.add("B");
			letters.add("C");
			String[] strArray = new String[letters.size()];
			strArray = letters.toArray(strArray);
			System.out.println(Arrays.toString(strArray));
		}

	}

