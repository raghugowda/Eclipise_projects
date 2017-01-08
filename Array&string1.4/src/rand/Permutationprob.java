package rand;

public class Permutationprob {
	
	boolean findpermu(String str)
	{
		int bitvector = createbitvector(str);
		return bitvector == 0 || checkonebitset(bitvector);
	}
	
	int createbitvector(String str)
	{
		int bitvector = 0;
		for(char c: str.toCharArray())
		{
			int x = getCharNumber(c);
			bitvector = toggle(bitvector, x);
		}
		return bitvector;
	}



	private int getCharNumber(char c) {
		// TODO Auto-generated method stub
		
		if(Character.isUpperCase(c))
			return c - 'A';
		else if (Character.isLowerCase(c))
			return c - 'a';
		else
		    return -1;
	}
	
	int toggle(int bitvector, int index)
	{
		if(index < 0)
			return bitvector;
		
		int mask = 1 << index;
		
		if((bitvector & mask) == 0 )
			bitvector |= mask;
		else
			bitvector &= ~mask;
		
		return bitvector;
	}
	
	boolean checkonebitset(int bitvector)
	{
		return(bitvector & (bitvector - 1)) == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Permutationprob pe_obj = new Permutationprob();
		
		boolean result = pe_obj.findpermu("ragragbc");
		
		if(result == true)
			System.out.println("It is palindrome");
		else
			System.out.println("Not a palindrome");

	}

}
