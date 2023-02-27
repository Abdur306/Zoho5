import java.util.*;
class NumtoChar{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String temp="";
while(n>0){
	char c=(char)((n-1)%26+'A');
	n=(n-1)/26;
	temp+=c;
}
System.out.println(temp);

}
}

