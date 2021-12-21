
public class Singleton {
	static String myString = new String();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = createString("hola");
	}
	
	public static String createString(String val) {
		if (myString != null && !myString.isEmpty()) {
			return myString;
		} else {
			myString = val;
			return myString;
		}
	}
}


