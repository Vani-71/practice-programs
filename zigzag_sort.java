import java.util.*;
class zigzag_sort{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int k=0;k<n;k++)
  {
   arr[k]=sc.nextInt();
  }
  for(int i=0;i<n-1;i++)
  {
    if(i%2==0)
    {
      if(arr[i]>arr[i+1])
      {
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
      }
    }
    else
    {
     if(arr[i]<arr[i+1])
     {
       int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
     }
    }
  }
  for(int x:arr)
  {
   System.out.print(x+" ");
  }
}}
