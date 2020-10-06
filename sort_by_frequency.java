import java.util.*;
class sort_by_frequency{
 public static void main(String args[])
 {
  int arr[]={1,2,2,4,2,3,5,6};
  Map<Integer,Integer> map=new LinkedHashMap<>();
  List<Integer> li=new ArrayList<>();
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
   
   map.entrySet().stream()
                 .sorted(Map.Entry.<Integer,Integer> comparingByValue().reversed())
                 .forEach(record->{
                     int key =record.getKey();
                     int value=record.getValue();
                     //System.out.println("key:"+ key +"value :"+ value);
                     
                     for(int i=0;i<value;i++)
                     {
                      li.add(key);
                     }
                     });
   System.out.print(li);
  System.out.println("map");
 System.out.print(map);
   
 }
}
