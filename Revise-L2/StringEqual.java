import java.util.*;
class StringEqual{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
Sytem.out.println("1st size");
int n=s.nextInt();
Sytem.out.println("2st size");
int m=s.nextInt();
String str1=new String[n];
String str2=new String[m];
String temp1="";
String temp2="";
Sytem.out.println("1st elements");
for(int i=0;i<n;i++)
	str1[i]=s.next();
System.out.println(Arrays.toString(str1));

Sytem.out.println("1st elements");
for(int i=0;i<m;i++)
	str2[i]=s.next();
System.out.println(Arrays.toString(str2));

}
}