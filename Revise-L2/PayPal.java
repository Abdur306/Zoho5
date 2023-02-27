import java.util.*;
class PayPal{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
int n=s.nextInt();
int len=(n/2)+1;
char arr[][]=new char[n][len];
for(int i=0;i<n;i++){
for(int j=0;j<len;j++){
 arr[i][j]=' ';	
}
}
Set(arr,str,n);
for(int i=0;i<n;i++){
for(int j=0;j<len;j++){
System.out.print(arr[i][j]+" ");	
}
System.out.println();
}
}
public static void Set(char arr[][],String str,int row ){
	int a=0,b=0,k=0;
	while(k<str.length()){
	a=0;
     while(a<row){
		 if(k==str.length())
			 return;
     if(arr[a][b]==' '){
		 arr[a][b]=str.charAt(k++);
	 }
 a++;
}		 
	a--;
	while(a>=0){
		if(k==str.length())
			return;
		if(arr[a][b]==' '){
			arr[a][b]=str.charAt(k++);
		}
		a--;
		b++;
	}
	b--;
	}
}
}

