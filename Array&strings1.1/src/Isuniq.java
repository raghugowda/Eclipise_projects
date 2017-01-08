
public class Isuniq {
	
	boolean isUnique(String str) {
		if(str.length() > 128) return false;
	
		boolean[] char_a = new boolean[128];
		
		for(int i=0;i < str.length(); i++)
		{
			int val = str.charAt(i);
			
			if(char_a[val]) {
				return false;
				
			}
			char_a[val] = true;
		}
		
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Isuniq obj = new Isuniq();
		
		boolean result = obj.isUnique("raghur");
		
		if(result == true)
			System.out.println("It is unique");
		else
			System.out.println("Not Unique");

	}

}
