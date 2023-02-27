import java.util.*;
class LongestSubStr{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(Substr(str));
}
public static int Substr(String str){
	int res=0;
	String temp="";
	for(int i=0;i<str.length();i++){
	for(int j=str.length()-1;j>=0;j--){
		String t2="";
		for(int k=i;k<=j;k++){
			t2+=str.charAt(k);
		}
		if(PresorNot(t2)){
			if(t2.length()>res){
				res=t2.length();
				temp=t2;
			}
		}
	}
	}
	System.out.println(temp);
	return res;
}
public static boolean PresorNot(String str){
	for(int i=0;i<str.length();i++){
	for(int j=i+1;j<str.length();j++){
	if(str.charAt(i)==str.charAt(j)){
	return false;
	}		
	}
	}
	return true;
}
}