package chapter12;

//Обяснете предимствата на използването на изключения.

public class Task7 {
	public static void test() throws FileParseException {
		try {
			throw new FileParseException();
		} catch (FileParseException e) {
			e.printStackTrace();
		}
	}
}
