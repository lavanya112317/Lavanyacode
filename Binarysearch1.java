//binarysearch1
import java.util.scanner;
public class Binarysearch1{
 public static void main(string[]args){
  inr []arr={1,3,5,7,9};
  int key=7;
  int low=0,high=arr.length-1;
  while(low<=high){
   int mid=(low+high)/2;
  if(arr[mid]==key)
    result= mid;
  else if(arr[mid]<key)
    low=mid+1;
  else 
    high=mid-1;
}
return -1;
if(result==-1) 
  System.out.println("element was not found");
else
  System.out.println("element was found");
 }
}

  
