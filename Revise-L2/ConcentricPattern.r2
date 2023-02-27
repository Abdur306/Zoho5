import java.util.*;
class ConcentricPattern{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int size=n;
int a[][]=new int[n][n];
int l=0;
int r=n-1;
while(l<n){
	
for(int i=l;i<=r;i++){
for(int j=l;j<=r;j++){
if(i==l||i==r||j==l||j==r){
a[i][j]=n;
}	
}
}
	l++;r--;n--;	
}
for(int i=0;i<size;i++){
for(int j=0;j<size;j++){
System.out.print(a[i][j]);	
}
System.out.println();
}
}
}