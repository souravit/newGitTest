package string;

public class Print_list_items_containing_all_characters_of_a_given_word {

	public static void main(String args[]){
		String a= "sun";
		String b ="utensile";
		char[] m=a.toCharArray();
		char[] s=b.toCharArray();
		int i,j,c=0;
		for( i=0;i<=a.length()-1;i++){
			for( j=0 ;j<=b.length()-1;j++){
				if(m[i]==s[j]){
					c++;
					break;
				}
			}
		}
		if(c==3)
			System.out.println("Sun");
	}
}
