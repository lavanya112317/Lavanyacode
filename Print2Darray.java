//print 2D array
import java.util.scanner;
public class Print2Darray{
  public static void main(string[]args){
  Scanner sc=new Scanner(System.in);
  int rows=sc.nextInt();
  System.out.println("enter the number of rows");
  int cols=sc.nextInt();
  System.out.println("enter the number of columns");
  int[][]arr= new int[rows][cols];
for(i=0;i<rows;i++){
  for(j=0;j<cols;j++){
    arr[i][j]=sc.nextInt();
  }
}
for(i=0;i<rows;i++){
  for(j=0;j<cols;j++){
    System.out.print(arr[i][j]+" ");
  }
  System.out.println();
}
}
}
  
A
