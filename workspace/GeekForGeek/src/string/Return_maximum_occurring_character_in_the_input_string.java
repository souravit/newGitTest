package string;

public class Return_maximum_occurring_character_in_the_input_string {
	public static void main(String...args) {
		String a="ouraaaaaaaaahavsinghsssssttgggggggggg";
		char[] s=a.toCharArray();
		int l = a.length();
		int i=0,j=0,c = 0;
		for(i=0;i<l-1;++i){
			c=0;
			for(j=0;i<l-1;++j){
			if(j<i && s[i]==s[j]){
					break;
				}
					if(s[j]==s[i]){
						c++;
					}
					if(j==l-1){
						System.out.println("the charater "+s[i]+" is present "+c+" times");
				}
			}
		}System.out.println("the charater "+s[i]+" is present "+c);
	}

}

