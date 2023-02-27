import java.util.*;
class Anagram{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String str[]=new String[n];
String str1[]=new String[n];
for(int i=0;i<n;i++)
	str[i]=s.next();
int k=0;
String temp="";
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(str[i].length()==str[j].length()){
	if(str[i].charAt(i)==str[i].charAt(j)){
		temp+=str[i];
	}
	else
		continue;

}
else
	continue;
}
}
	
	
System.out.println(Arrays.toString(str1));
}
}