package practice_strings;

public class StringsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String o = "hello";
		
		String extractedString = o.substring(2);
		
		System.out.println(o.length());
		System.out.println(extractedString);
		System.out.println(o.charAt(3));
		
		if(o.equals("hello")) {
			System.out.println("Teste");
		}
	}

}
