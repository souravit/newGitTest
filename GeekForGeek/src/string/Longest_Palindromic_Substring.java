package string;

public class Longest_Palindromic_Substring {
	public static void main(String[] args) {
		String s="forgeeksskeegforaaaaaaaaaaaaaaaaaa";
		char[] a=s.toCharArray();
		int l,b,e,m,i,c = 0;
		l=s.length();
		b=0;
		e=l;
		m=(b+e)/2;
		for(i=0;i<m;i++){
			if(a[i]==a[l-1-i]){
				c++;
			}else{
				c=0;
			}
			
		}
		for(i=m-c;i<m+c;i++){
			System.out.print(a[i]);
		}
		
		}
	}

