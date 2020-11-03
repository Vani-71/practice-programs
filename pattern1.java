class pattern1{
 public static void main(String args[])
 {
   int n=4;
   int temp=n;
   int s=1;
   for(int i=0;i<(n+n-1);i++)
   {
     if(i<n)
     {
     for(int j=0;j<=i;j++)
     {
       System.out.print("*"+" ");
     }
     System.out.print("\n");
     }
     else
     {
       temp--;
       for(int k=1;k<=temp;k++)
       {
         System.out.print("*"+" ");
       }
       System.out.print("\n");
       
     }
   }
 }
}
