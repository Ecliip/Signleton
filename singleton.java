public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos una instancia unica de un string
		String aString = createString("hola");
	}
	
	public static String createString(String val) {
		if (myString != null && !myString.isEmpty()) {
			return myString;
		} else {
			myString = new String(val);
			return myString;
		}
	}

}
