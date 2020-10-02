import java.util.*;
class gcd{
public static void main(String args[])
{
  Scanner sc =new Scanner(System.in);
  int arr[]=new int[5];
  int n=sc.nextInt();
  for(int i=0;i<n;i++)
  {
     arr[i]=sc.nextInt();
  }
  Map<Integer,Integer> map=new LinkedHashMap<>();
  
 for(int j=0;j<n;j++)
 { 
   int x=1;
   while(x<=arr[j])
   {
     if(arr[j]%x==0)
     {
       if(map.containsKey(x))
       {
         map.put(x,map.get(x)+1);
       }
       else
       {
         map.put(x,1);
       }
     }
     x++;
   }
 }
 System.out.print(map);
  
  int max=Integer.MIN_VALUE;
   for(Map.Entry<Integer,Integer> data : map.entrySet())
  {
   if(data.getValue()==n)
   {
    max=Math.max(max,data.getKey());
   }
 }
//System.out.println(map); 
 System.out.println("GCD :"+max); 
 
 
 ///lcm
int ans=1;
int count=0;
boolean flag=true; 
int s=2,item=0;
int h=0;
 while(flag)
 {
  for(int k=0;k<n;k++)
  {
    if(arr[k]%s==0)
    {
       arr[k]=arr[k]/s;
       count++;
    }
  }
   //System.out.println("count"+count);
  if(count==0)
  {
    s=s+1;
  }
  else
  {
   ans=ans*s;
   s=2;
  }
  count=0;
  for(int y=0;y<n;y++)
  {
    if(arr[y]==1)
    {
      item++;
    }
  //System.out.print(arr[y]+" ");
  }
  if(item==n)
   {
     flag=false;
   }
   item=0;
   
 }
  System.out.print("LCM:"+ans);

 
}
}
