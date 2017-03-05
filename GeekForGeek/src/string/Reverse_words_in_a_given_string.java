package string;

public class Reverse_words_in_a_given_string {
public static void main(String[] args) {
	String a = "mye love sex very much";
	char[] b =a.toCharArray();
	int i,j,k=0;
	char temp;
	int c=b.length;
//	for(i=0;i<=(c-1)/2;i++){
//		temp= b[i];
//		b[i]=b[c-1-i];
//		b[c-1-i]=temp;
//		
//	}
//	for(i=0;i<b.length;i++){
//		System.out.print(b[i]);
//	}
	
	for(i=0;i<=c-1;i++){
		if(Character.isWhitespace(b[i])){
			System.out.println(i);
			int x =(i-1)/2;
			for(j=i-1;j>=(j-k)/2+k;j--){
				
				temp=b[j];
				//System.out.println(temp);
				b[j]=b[k];
				//System.out.println(b[j]);
				b[k]=temp;
				//System.out.println(b[k]);
			}
			k=i+1;
		}
		
	}
	for(i=0;i<=c-1;i++){
		System.out.print(b[k]);
	}
}
}
