import java.util.*;
public class capitalize_first_letter{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   String words[]=s.split("\\s");
   for(String sub : words)
   {
     String x=sub.substring(0,1);
    String y=sub.substring(sub.length()-1);
    String res=x.toUpperCase()+sub.substring(1,sub.length()-1)+y.toUpperCase();
    System.out.print(res);
    System.out.print(" ");

   }
   }}
