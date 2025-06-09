//binary search 
import java.util.scanner;
public class Binarysearch{
public static int binarysearch(int[]art,int key){
int low=0,high=arr.length-1;
 while(low<=high){
  int mid=(low+high)/2;
 if(arr[mid]==key)
   return mid;
 else if(arr[mid]<key)
   low = mid+1;
 else 
   high= mid-1;
}
public static void main(string[]args){
 int n= 6;
 int []arr={2,4,6,8,10,12};
 int key=8;
 int result=binarysearch(arr,key);
 if (result==-1)
   System.out.println("element was not found");
 else
   System.out.println("element was found at index:"+result);
}
}
