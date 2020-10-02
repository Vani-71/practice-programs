import java.util.*;
class matrix{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[][]=new int[n][n];
  System.out.println("Enter matrix:");
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
    arr[i][j]=sc.nextInt(); 
   }
  }
  System.out.println("clockwise");
  for(int i=0;i<n;i++)
  {
   for(int j=n-1;j>=0;j--)
   {
    System.out.print(arr[j][i]+" ");
   }
   System.out.print("\n");
  }
  System.out.println("Anticlockwise");
  for(int i=n-1;i>=0;i--)
  {
   for(int j=0;j<n;j++)
   {
    System.out.print(arr[j][i]+" ");
   }
   System.out.print("\n");
  }
}
}
