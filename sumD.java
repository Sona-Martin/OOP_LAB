import java.util.Scanner;
class sumD{
public static void main(String args[]){
Scanner inputObj= new Scanner (System.in);
System.out.println("Enter the number of numbers");
int n=inputObj.nextInt();

System.out.println("Enter the numbers");
int max=Integer.MIN_VALUE;
for(int i=0;i<n;i++)
{
int num=inputObj.nextInt();
if(num>max)
max=num;
}


System.out.println("The largest of these no.s is:"+max);


}
}
