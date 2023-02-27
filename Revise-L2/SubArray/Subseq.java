import java.util.*;
class Subseq{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
char []y=str.toCharArray();
sub(y,0,0);
}
public static void sub(char []y,int st,int ed){
	if(st==y.length)
		return;
	if(ed==st){
		System.out.print(y[st]);
		sub(y,st,ed+1);
	}
	else if(ed<y.length){
		System.out.print(" ");
		for(int i=st;i<=ed;i++){
			System.out.print(y[i]);
		}
		sub(y,st,ed+1);
	}
	else{
		sub(y,st+1,0);
	}


}
}