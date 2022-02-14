import java.util.Scanner;
class usrInpt{
public static void main(String args[]){
Scanner inputObj=new Scanner(System.in);

System.out.println("Enter the name, age and salary:");

String name= inputObj.nextLine();
int age=inputObj.nextInt();
double salary = inputObj.nextDouble();

System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Salary:"+salary);
}
}
