import java.util.*;
class array_rank{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int arr[]=new int[7];
   for(int i=0;i<7;i++)
   {
     arr[i]=sc.nextInt();
   }
   int unsort[]=new int[7];
   
   for(int i=0;i<7;i++)
   {
     unsort[i]=arr[i];
   }
   
   Map<Integer,Integer> map=new TreeMap<>();
   
   Arrays.sort(arr);
   int s=1;
   
   for(int i=0;i<7;i++)
   {
     if(map.containsKey(arr[i])==false)
     {
       map.put(arr[i],s);
       s++;

     }
   }
   System.out.print("Array: ");
   for(int b : unsort)
   {
     System.out.print(b+" "); 
   }
    System.out.println();
   System.out.print("Rank: ");
   for(int k : unsort)
   {
     if(map.containsKey(k))
     {
       System.out.print(map.get(k)+" ");
     }
   }
   
  //System.out.print(map);
 }}
