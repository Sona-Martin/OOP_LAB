import java.util.Scanner;
public class secondsmallest{
public static void main(String args[]){
System.out.println("Enter the no of elements");
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
int i,j,temp,size;
int arr[]=new int[n];
System.out.println("Enter the elements");
for(i=0;i<n;i++)
{
arr[i] = sc.nextInt();
}
size=arr.length;
for(i=0;i<size;i++){
for(j=i+1;j<size;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("Second smallest element is "+arr[1]);
}
}

