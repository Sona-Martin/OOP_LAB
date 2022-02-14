import java.util.Scanner;
public class palindrome
{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the string");
     String s=sc.nextLine();
     int l=s.length();
     int i,j,flag=0;
     for(i=0,j=l-1;i<l/2;i++,j--)
     	if(s.charAt(i)!=s.charAt(j))
     	 {
     	   flag=1;
     	   break;
     	 }
   if(flag==1)
     System.out.println("The given string is not a palindrome");
   else
     System.out.println("The given string is a palindrome");
}
}

