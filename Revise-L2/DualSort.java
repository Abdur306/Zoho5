import java.util.*;
class DualSort{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
for(int i=0;i<n;i++){
	int index=i;
for(int j=i+1;j<n;j++){
	if(a[j]<a[index])
		index=j;
}
int temp=a[index];
a[index]=a[i];
a[i]=temp;
}


for(int i=0;i<n;i+=2){
int temp=a[n-1];
for(int j=n-1;j>i;j--){
	a[j]=a[j-1];
}
a[i]=temp;
}
for(int i=0;i<n;i++)
	System.out.print(a[i]+" ");

}
}