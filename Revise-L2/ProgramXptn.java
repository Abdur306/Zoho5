import java.util.*;
class ProgramXptn{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
int n=str.length();
print(str,n);
}
public static void print(String str,int n){
	int k=n;
	for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
		
if(i==j){
	System.out.print(str.charAt(i)+" ");
	
else if(n==i+j+1)
	System.out.print(str.charAt(j)+" ");
else
	System.out.print(" ");	
		
	}
	System.out.println();
	}

}
}