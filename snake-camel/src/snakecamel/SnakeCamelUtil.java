package snakecamel;

public class SnakeCamelUtil {
	
	public static void main(String[] args) {
		System.out.println("itoHaruka".equals(snakeToCamelcase("ito_haruka")) ? true : false);
		System.out.println("ito_haruka".equals(camelToSnakecase("itoHaruka")) ? true : false);
		
		System.out.println(snakeToCamelcase("itoHaruka"));
		System.out.println(camelToSnakecase("ito_haruka"));
		System.out.println(capitalize("Haruka"));
		System.out.println(uncapitalize("haruka"));
	}

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		sb.append(words[0]);
		for (int i = 1; i < words.length; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(camelcase.substring(j, i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
				j = i;
			}
		}
		sb.append(camelcase.substring(j+1));
		return new String(sb);
	}
	
	static String capitalize(String s) {
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
	
}
