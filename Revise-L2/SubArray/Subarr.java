import java.util.*;
class Subarr{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
System.out.println("size");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("elements");
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int st=0,ed=0;
boolean res=true;int count=0;
System.out.println("target");
int target=s.nextInt();
for(int i=0;i<n;i++){
	int total=0;	
	for(int j=i;j<n;j++){
	   total+=a[j];
		if(total==target){
			st=i;ed=j;
			res=false;
			count++;
			total=0;
			//break;
		}
	}
}
	      for(int k=st;k<=ed;k++)
			  System.out.print(a[k]+" ");
if(res)
	System.out.println("Not found");
else
	System.out.println("count"+count);

}
}