package per;

public class String_edit {
	
	public static void replaceSpaces(char[] str,int length){
		int spaceCount = 0,newLength=0,i=0;

		//first scan
		for (i=0;i<length;i++) {
		if(str[i]==' '){
		spaceCount++;
		}
		}
		newLength = length + 2 * spaceCount;

		char[] newArray = new char[newLength+1];
		newArray[newLength] = '\0';
		int newArrayPosition = 0;

		//second scan
		for (i=0;i<length;i++) {
		if(str[i]==' '){
		newArray[newArrayPosition] = '%';
		newArray[newArrayPosition+1] = '2';
		newArray[newArrayPosition+2] = '0';
		newArrayPosition = newArrayPosition+3; 
		}

		else{
		newArray[newArrayPosition] = str[i];
		newArrayPosition++;
		}
		}
		System.out.println(newArray);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String_edit new_obj = new String_edit();
		
		String str = "I am fine now";
		char[] str1 = str.toCharArray();
		
		
		new_obj.replaceSpaces(str1, 13);


	}

}
