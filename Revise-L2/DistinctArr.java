import java.util.*;
class  DistinctArr{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
int a[]=new int[n];
int res[]=new int[10];
int flag=0;
System.out.println("enter the elements");
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
System.out.println("enter the target");
int target=s.nextInt();
for(int i=1;i<=10;i++){
	res[i-1]=i;
}
for(int i=0;i<n;i++){
for(int j=0;j<10;j++){
 if(a[i]==res[j]){
    flag=1;
 }	 	
}
}
for(int i=0;i<10;i++){
	if(res[i]!=1 && target==res[i])
	System.out.println("target is : "+res[i]+" @ "+i);
}


}
}