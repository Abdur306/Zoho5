import java.util.*;
class CocenPat{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int rows=2*n-1;
int a[][]=new int[rows][rows];
int l=0;
int r=rows-1;
while(n!=0){
	
	for(int i=l;i<=r;i++){
	for(int j=l;j<=r;j++){
	if(i==l||i==r||j==l||j==r){
a[i][j]=n;
	}		
	}
	}
	l++;r--;n--;
	}
for(int i=0;i<rows;i++){
for(int j=0;j<rows;j++){
	System.out.print(a[i][j]+" ");
}
System.out.println();
}


}
}