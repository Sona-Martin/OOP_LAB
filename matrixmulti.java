//program to multiply two given matrices
import java.util.Scanner;

public class matrixmulti{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a[][],b[][],c[][];
a= new int[10][10];
b= new int[10][10];
c= new int[10][10];
System.out.println("Enter the number of row and column of matrix A and matrix B respectively");
int m=sc.nextInt();
int n=sc.nextInt();
int p=sc.nextInt();
int q=sc.nextInt();
if(n==p)
{
System.out.println("Enter the elements of matrix A");
for(int i=0;i<m;i++)
 {
 for(int j=0;j<n;j++)
  a[i][j]=sc.nextInt();
}
System.out.println("Enter the elements of matrix B");
for(int i=0;i<p;i++)

{ 
for(int j=0;j<q;j++)
b[i][j]=sc.nextInt();
}

System.out.println("Elements of matrix A are:");
for(int i=0;i<m;i++)
 {
for(int j=0;j<m;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}

System.out.println("Elements of matrix B are:");
for(int i=0;i<p;i++)

{
for(int j=0;j<q;j++)
System.out.print(b[i][j]+" ");
System.out.println();
}

System.out.println();
System.out.println();

System.out.println("Elements of matrix C are:");
for(int i=0;i<m;i++)
 {for(int j=0;j<q;j++)
  {c[i][j]=0;
for(int k=0;k<n;k++)
c[i][j]=c[i][j]+a[i][k]*b[k][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
else
System.out.println("Matrix multiplication not possible");
}}


