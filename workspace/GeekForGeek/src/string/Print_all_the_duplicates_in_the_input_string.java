package string;

public class Print_all_the_duplicates_in_the_input_string {
public static void main(String[] args) {
	String s ="test string";
	char[] a=s.toCharArray();
	int l =s.length();
	int i,j,c=0;
	for(i=0;i<=l-1;i++){
		c=0;
		for(j=0;j<=l-1;j++){
			if(j<i && a[i]==a[j]){
				break;
			}
			if(a[i]==a[j]){
				c++;
			}
			if(j==l-1 && c >1){
				System.out.println(a[i]+" count "+c);
			}
		}
	}
}
}
