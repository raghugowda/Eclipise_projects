package def_pack;

public class Compress {
	
	String compress(String str)
	{
		int finallength = findlength(str);
		
		if(finallength >= str.length())
			return str;
		
		StringBuilder compress = new StringBuilder(finallength);
		int count = 0;
		
		for(int i=0; i<str.length();i++)
		{
			count++;
			if(i+1 >=str.length() || (( str.charAt(i) != str.charAt(i+1))))
					{
						compress = compress.append(str.charAt(i));
						compress = compress.append(count);
						count = 0;
					}
		}
		return compress.toString();
		
	}
	
	int findlength(String str)
	{
		int compresslength = 0;
		int count = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			count++;
			
			if(i+1>=str.length() || str.charAt(i)!=str.charAt(i+1)) 
					{
						compresslength += 1 + String.valueOf(count).length();
						count = 0;
					}
		}
		
		return compresslength;
	}

	public static void main(String[] args) {
		
		Compress obj = new Compress();
		
		String res = obj.compress("abbccccdeee");
		
		System.out.println("Result is  " + res);
		// TODO Auto-generated method stub

	}

}
