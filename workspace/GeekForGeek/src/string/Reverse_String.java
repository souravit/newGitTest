package string;

public class Reverse_String {
	public static void main(String[] args) {
		String a="sexybitch";
		char[] c=a.toCharArray();
		int i;
		char temp;
		int co = a.length();
		for(i=0;i<=(co-1)/2;i++){
			temp=c[i];
			c[i]=c[co-1-i];
			c[co-1-i]=temp;
		}
		for(i=0;i<=co-1;i++){
			System.out.print(c[i]);
		}
	}

}
