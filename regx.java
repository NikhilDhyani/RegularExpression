import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class regx {

     

   private static final String REGEX = "https";
   private static final String INPUT = "9 Ways to Become More Creative in the Next 10 Minutes by @larrykim https://medium.com/swlh/9-ways-to-become-more-creative-in-the-next-10-minutes-94c329b72af5";

   
 static int start1 ;
      static int end1;
   public static void main( String args[] ) {

     Scanner in = new Scanner(System.in);     

      String s = in.nextLine();

     
 
      Pattern p = Pattern.compile(REGEX);
      Matcher m = p.matcher(s);   // get a matcher object
      int count = 0;

      
     System.out.println("Length is "+ INPUT.length());

     end1 =s.length();

      while(m.find()) {
 
        System.out.println("inside while");
         count++;
         System.out.println("Match number "+count);
         System.out.println("start(): "+m.start());
           
          start1 = m.start();
 
         System.out.println("end(): "+m.end());
      }

         System.out.println(s.substring(start1, end1));
   }
}