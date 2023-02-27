import java.util.*;
class Duplicate{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
            int count=0;                  //2 3 4 5 6 4 5 3
for(int i=0;i<n;i++){         //2 3 4 5 6 - - -
for(int j=i+1;j<n;j++){
	if(a[i]==a[j]){
		System.out.print(count);
	count++;	
	a[j]='-';
	break;
	
}
}
}

for(int i=0;i<n;i++){
	if(a[i]!='-')
	System.out.print(a[i]+" ,");
}
for(int i=0;i<count-1;i++)
System.out.print("-"+",");


}
}