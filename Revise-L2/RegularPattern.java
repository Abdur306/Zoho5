import java.util.*;
class RegularPattern{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str=s.next();
System.out.println("enter the Pattern");
String pattern=s.next();
boolean result=true;
if(str.length()==pattern.length()){
for(int i=0;i<str.length();i++){
	if(str.charAt(i)==pattern.charAt(i))
		result=false;
	else if(pattern.charAt(i)=='*')
	    result=false;
}
}
else
	result=true;

if(result)
	System.out.println("False");
else
	System.out.println("True");
}
}