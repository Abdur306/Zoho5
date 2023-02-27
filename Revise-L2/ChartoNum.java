import java.util.*;
class ChartoNum{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
int result=0;
for(int i=0;i<str.length();i++){
	result*=26;
	result+=str.charAt(i)-'A'+1;
}
System.out.println(result);

}
}
