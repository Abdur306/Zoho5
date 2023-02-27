import java.util.*;
class StringCheck{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str1=s.next();
//String str2=s.next();
boolean res=true;
String temp="";
for(int i=0;i<str1.length();i++){
	if(str1.charAt(i)>='A' && str1.charAt(i)<='Z'){
	temp=temp+((char)(str1.charAt(i)+32));
}
else{
	temp+=str1.charAt(i);
	continue;
}
}

for(int i=0;i<temp.length();i++){
	for(int j=i+1;j<temp.length();j++){
	if(temp.charAt(i)==temp.charAt(j))
       res=false;		
	}
}
if(res)
	System.out.println("True");
else
	System.out.println("False");





}
}