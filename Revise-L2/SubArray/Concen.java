import java.util.*;
class Concen{
public static void main(String [] abu){
Scanner st=new Scanner(System.in);
int n=st.nextInt();
int size=2*n-1;
int a[][]=new int[size][size];
int s=0,e=size-1;
while(n!=0){
	
for(int i=s;i<=e;i++){
	for(int j=s;j<=e;j++){
	if(i==s||i==e||j==s||j==e){
a[i][j]=n;
	}		
	}
}
n--;s++;e--;
}
for(int i=0;i<size;i++){
for(int j=0;j<size;j++){
System.out.print(a[i][j]+" ");	
}
System.out.println();
}
}
}