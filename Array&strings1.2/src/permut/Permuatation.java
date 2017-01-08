package permut;

public class Permuatation {
	
	boolean permuta(String s, String t){
		
		if(s.length() != t.length())
			return false;
		
		int[] letters = new int[128];
		
		char[] s_array = s.toCharArray();
		
		for(char c : s_array )
		{
			letters[c]++;
		}
		
		for(int i=0; i<t.length(); i++)
		{
			int c = (int)t.charAt(i);
			letters[c]--;
			if(letters[c] < 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Permuatation ob = new Permuatation();
		
		boolean result = ob.permuta("raghu", "uhrai");
		
		if(result == true)
			System.out.println("Identical char count");
		else
			System.out.println("Not identical");

	}

}
