package string;

public class Run_Length_Encoding {
	public static void main(String[] args) {
		String a = "wwwwaaadexxxxxx";
		char[] b =a.toCharArray();
		int i,j,k=0;
		char temp;
		int c=b.length;
		for(i=0;i<c;i++){
			k=0;
			for(j=0;j<c;j++){
				if(j<i &&b[i]==b[j]){
					break;
				}
				if(b[i]==b[j]){
					k++;
				}
				if(j==a.length()-1){
					System.out.print(""+b[i]+""+k);
				}
				
			}
		}
	}
	
	

}
