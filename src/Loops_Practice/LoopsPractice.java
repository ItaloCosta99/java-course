package Loops_Practice;

/**
 * @author T-Gamer
 *
 */
public class LoopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "We have a large inventory of things in our warehouse falling in "
				+ "the category:apperal and the slightly "
				+ "more in demand category:makeup along with the category:furniture and ....";

		printCategories(str);
	}

	/**
	 * extract all categories from the string argument
	 * 
	 * @param str
	 */
	private static void printCategories(String string) {
		int i = 0;
		while (true) {
			int found = string.indexOf("category:", i);
			if (found == -1)
				break;
			int start = found + 9;
			int end = string.indexOf(" ", start);
			System.out.println(string.substring(start, end));

			i = end + 1;
		}
	}

}
