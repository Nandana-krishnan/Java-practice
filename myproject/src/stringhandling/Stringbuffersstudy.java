package stringhandling;

public class Stringbuffersstudy {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("shine ");
		System.out.println(sb);
		System.out.println("appending:"+sb.append(" smile"));
		System.out.println("insert:"+sb.insert(6,"dream"));
		System.out.println("delete:"+sb.delete(5, 11));//delete 5 to 12 indexile characters
		//System.out.println("reverse:"+sb.reverse());
		System.out.println("replace:"+sb.replace(5,5," jimin"));
		System.out.println("lenght:"+sb.length());
		System.out.println("substring:"+sb.substring(5,11));
		System.out.println("charat:"+sb.charAt(6));
		System.out.println("index:"+sb.indexOf("jimin"));
	}

}
