package stringhandling;
public class Stringmethods {
//0-9=48 to 57,A-Z =65 to 90.a-z = 97 to 122
	public static void main(String[] args) {
		String name = "Rkive for RM";
		String name1 = " hello ";
		byte ascii[] = {65,66,67};
		int age = 27;
		String s1 = new String(ascii);
		System.out.println(s1);
		System.out.println("Name:"+name);
		System.out.println("in upper case:"+name.toUpperCase());
		System.out.println("in lower case:"+name.toLowerCase());
		System.out.println("First character:"+name.charAt(0));
		System.out.println("Length:"+name.length());
		System.out.println("last char:"+name.charAt(4));
		System.out.println("LAST WORD:"+name.substring(8,12));
		System.out.println("aaba:"+name.indexOf('x'));
		System.out.println("replaced one:"+name.replace('R','N'));
		System.out.println("replaced one:"+name.replace("RM","NAMJOON"));
		System.out.println("replaced full string:"+name.replaceAll("Rkive","hello"));
		System.out.println("Compare one and two :"+name.compareTo(name1));
		System.out.println("Trimming white space:"+name1.trim());
	}

}
