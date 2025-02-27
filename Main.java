// Composition Starter     A+CR
public class Main
{
   public static void main(String[] args)
   {
       Word w1 = new Word("Sri Lanka");
       System.out.println(w1.toString());
       System.out.println(w1.length());
       System.out.println(w1.substring(3));
       System.out.println(w1.vowelCount());
       System.out.println(w1.backwards());
       System.out.println(w1.insertLetter('E', 3));
       
   }
}