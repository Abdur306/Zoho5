import java.util.*;
class SubSequenceChar{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
char []y=str.toCharArray();
Subseq(y,0,0);
}
public static void Subseq(char a[],int st,int ed){
	if(st==a.length)
		return;
	if(ed==st){
		System.out.print(a[st]);
	    Subseq(a,st,ed+1);
	}
	else if(ed<a.length){
		System.out.print(" ");
		for(int i=st;i<=ed;i++){
			System.out.print(a[i]);
		}
		Subseq(a,st,ed+1);
	}
	else
		Subseq(a,st+1,0);

}
}