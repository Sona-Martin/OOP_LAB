/*B6. Write a Java program to demonstrate the use of garbage collector*/
class memoryDemo{
  public static void main(String args[])
  {
   Runtime r = Runtime.getRuntime(); 
   long mem1;
   Integer someints[]=new Integer[1000];
   System.out.println("Total memory is :"+ r.totalMemory());
   mem1=r.freeMemory();
   System.out.println("Initial free memory:" +mem1);
   System.gc();
   mem1=r.freeMemory();
   System.out.println("free memory after garbage collection:" +mem1);   
  }
}
