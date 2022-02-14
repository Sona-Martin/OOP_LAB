import java.util.Scanner;
public class reverse{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String reverse = "";
System.out.println("Enter a string");
String s= sc.nextLine();
int l =s.length();
int i;
for(i=l-1;i>=0;i--)
{
reverse=reverse+s.charAt(i);
}
System.out.println("Reverse of the string is : "+reverse);
}
}
