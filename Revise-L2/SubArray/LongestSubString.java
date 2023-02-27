import java.util.*;
class LongestSubString{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
System.out.println(Subseq(str));
}
public static int Subseq(String str){
	int res=0;
	String temp="";
	for(int i=0;i<str.length();i++){
	for(int j=str.length()-1;j>=0;j--){
	String pass="";
    for(int k=i;k<=j;k++){
    pass+=str.charAt(k);
    }
    if(Present(pass)){
     if(pass.length()>res){
		 res=pass.length();
		 temp=pass;
	 }
	}		
		
	}
	}
System.out.println(temp);
return res;
}
public static boolean Present(String str){
	for(int i=0;i<str.length();i++){
	for(int j=i+1;j<str.length();j++){
	if(str.charAt(i)==str.charAt(j))
		return false;
	}
	}
	return true;
}
}