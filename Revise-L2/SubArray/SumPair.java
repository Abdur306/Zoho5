import java.util.*;
class SumPair{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
int target=s.nextInt();
int count=0;
boolean res=true;
for(int i=0;i<n;i++){
 int total=0;
 for(int j=i;j<n;j++){
	 total+=a[j];
   if(target==total){
	   count++;
       res=false;
	  for(int k=i;k<=j;k++)
		  System.out.println(a[k]);
   }
 }
}
if(res)
	System.out.println("not found");
else
	System.out.println("count"+count);
}
}