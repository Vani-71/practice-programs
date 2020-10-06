import java.util.*;
class MapSort{
 public static void main(String args[])
 {
  int arr[]={1,2,2,4,2,3,5,6};
  Map<Integer,Integer> map=new LinkedHashMap<>();
  //List<Integer> li=new ArrayList<>();
  for(int j=0;j<arr.length;j++)
 { 

       if(map.containsKey(arr[j]))
       {
         map.put(arr[j],map.get(arr[j])+1);
       }
       else
       {
         map.put(arr[j],1);
       }
     
   }
   
   List<Map.Entry<Integer,Integer>> list=new LinkedList<Map.Entry<Integer,Integer>>(map.entrySet());
   
   Collections.sort(list,new  Comparator<Map.Entry<Integer,Integer>>()
   {
      public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2)
      {
        return o1.getValue().compareTo(o2.getValue());
      }
   });
   
    System.out.print(list);
   
 }
}
