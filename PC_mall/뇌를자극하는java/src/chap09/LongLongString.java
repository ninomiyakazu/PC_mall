package chap09;

public class LongLongString {

	public static void main(String[] args) {
		
		
		StringBuilder stringbuilder = new StringBuilder();
		
		for(String str :  args) {
			if(str.equals(""))
		   stringbuilder.append(str);	
		   stringbuilder.append(" ");
		}
		System.out.println(stringbuilder);
	}

}
