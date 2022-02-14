import java.util.Scanner;
public class prime{
public static void main(String args[]){
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i;
int flag=0;
for(i=2;i<=n/2;i++){
if(n%i==0)
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println("Not prime");
}
else
{
System.out.println("Prime");
}
}
}

