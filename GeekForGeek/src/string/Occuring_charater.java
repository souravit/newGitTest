package string;

public class Occuring_charater {
public static void main(String[] args) {
	String s="ababbaec";
	char[] a =s.toCharArray();
	int l=s.length();
	int i,j,c=0;
	for(i=0;i<l;i++){
		c=0;
		for(j=0;j<l;j++){
			
			if (j<i && a[i]==a[j]){
				break;
			}
			if(a[j]==a[i]){
				c++;
			    System.out.print(c);
				System.out.print(a[i]);
				System.out.print(a[j]);
				System.out.print(j);
				System.out.println();
			}
			if(j==l-1){
				System.out.println("the charater "+a[i]+" is present "+c+" times");
		}
			
		}
	}
}
}
