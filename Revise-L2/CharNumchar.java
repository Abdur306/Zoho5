import java.util.*;
class CharNumchar{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("Enter Number");
int n=s.nextInt();
String temp="";
while(n>0){
	char c=(char)((n-1)%26+'A');
	n=(n-1)/26;
	temp=temp+c;
}
System.out.println("Num To Char :"+temp);
System.out.println("Enter String");
String st=s.next();
int res=0;
for(int i=0;i<st.length();i++){
	res*=26;
	res+=st.charAt(i)-'A'+1;
	
	
}
	System.out.println("Char to num :"+res);
}
}