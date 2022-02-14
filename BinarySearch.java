//week 6 - binary search

import java.util.Scanner;

class BinarySearch{
public static void binarySearch(int arr[], int first, int last, int key){
int mid = (first + last)/2;
while( first <= last ){
if ( arr[mid] < key ){
first = mid + 1;
}else if ( arr[mid] == key ){
System.out.println("Element is found at position: " + (mid+1));
break;
}else{
last = mid - 1;
}
mid = (first + last)/2;
}
if ( first > last ){
System.out.println("Element is not found!");
}
}

public static void main(String[] args){

Scanner sc= new Scanner(System.in);
int arr[];
arr=new int[10];

System.out.println("Enter the size ofthe array");
int n= sc.nextInt();

System.out.println("Enter the elements of matrix A in ascending order");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

System.out.println("Enter the element to be searched");
int key=sc.nextInt();
binarySearch(arr, 0, n-1, key);
}
}

