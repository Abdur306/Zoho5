import java.util.*;
class StrRev{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String word="";
String rev="";
str+=" ";
System.out.println(Rev(str,rev,word,0));
}
public static String Rev(String str,String rev,String wd,int i){
    if(i==str.length())
		return rev;
	char c=str.charAt(i);
	if(c!=32)
		return Rev(str,rev,wd+c,i+1);
	else
		return Rev(str,wd+" "+rev,"",i+1);
}
}