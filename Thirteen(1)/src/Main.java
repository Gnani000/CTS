import java.util.StringTokenizer;

public class Main {
	public String  Say()
	{
		return "HelloWorld";
	}
	
	public static String reverseWord(String str)
	{
		StringBuilder result= new StringBuilder();
		StringTokenizer tokenizer=new StringTokenizer(str,"");
		
		while(tokenizer.hasMoreTokens())
		{
			StringBuilder sb=new StringBuilder();
			sb.append(tokenizer.nextToken());
			sb.reverse();
			result.append(sb);
			result.append(" ");
		}
		return result.toString();
		
	}

}
