package string;

public class Check_whether_two_strings_are_anagram_of_each_other {
	public static int i,j;
	public static 
	 char temp;
	
		public static String a= "elisnetu";
		String b ="utensile";
		public static char[] m=a.toCharArray();
		char[] s=b.toCharArray();
		
		//static char value1=m[j];
		// char value2=m[j-1];
public static void function1(char value1,char value2,String value3){
	for(i=0;i<value3.length();i++){
		for(j=i+1;j>0;j--){
			if(value1>value2){
				temp=value1;
				value1=value2;
				value2=temp;
			}
		}
		
	} a=String.valueOf(m);
    System.out.println(a);
}
public static void main(String[] args) {
	Check_whether_two_strings_are_anagram_of_each_other.function1(m[j], m[j-1], a);
}
}
