package string;

public class Remove_duplicate_Charaters {
public static void main(String[] args) {
	String s="geeksforgeekssajdajskdhk";
	int l=s.length();
	char[] a=s.toCharArray();
	int i,j;
	System.out.println(l);
	for(i=0;i<l;i++){
		if (a[i]==a[i+1]){
			for(j=i;j<l;j++){
				a[j]=a[j+1];
				l--;
			}
		}
	}for(j=0;j<l;j++){
		System.out.println(a[j]);
	}
	
}
}
