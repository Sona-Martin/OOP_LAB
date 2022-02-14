import java.util.Scanner;
public class frequency
{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the string");
     String s=sc.nextLine();
     int l=s.length();
     int i;
     int count=0;
     System.out.println("Enter the charecter");
     char c = sc.next().charAt(0);
     for(i=0;i<l;i++)
     	if(s.charAt(i)==c)
     	 {
     	   count++;
     	 }
   if(count>0)
   {
     System.out.println("There are "+count+" "+c"in the string");
   }else{
     System.out.println("The given character is not present in the string.");
     }
}
}

