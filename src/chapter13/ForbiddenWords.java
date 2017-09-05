package chapter13;

public class ForbiddenWords {
	
	public static void replaceForbiddenWords(String text, String forbidden){
		String[] array = forbidden.split("[,]");
		String x;
		String result = text;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < array.length; i++){
			sb.setLength(0);
			x = array[i];
			for(int j = 0; j < array[i].length(); j++){
				sb.append("*");
			}
			result = result.replaceAll(x, sb.toString());
		}
		System.out.println(result);
	}
		
	public static void main(String[] args){
		String text = "Microsoft announced its next generation Java compiler today. It "
				+ "uses advanced parser and special optimizer for the Microsoft JVM.";

		replaceForbiddenWords(text, "Java,JVM,Microsoft");
	}
}
