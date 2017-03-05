package string;

public class Anagram {
	public static void main(String[] args) {
		String a="string";
		String b="gnirts";
		int i,j;
		char temp;
		char[] m=a.toCharArray();
		//char [] n=b.toCharArray();
		for(i=0;i<(m.length-1);i++){
			for(j=i+1;j>0;j--){
				if(m[j]<m[j-1]){
					temp=m[j-1];
					m[j-1]=m[j];
					m[j]=temp;
					
					
				}
			}
		}
		a=String.valueOf(m);
	    System.out.println(a);
		}
	}

