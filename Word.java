public class Word
{
   private String theWord;

   public Word()
   {
      theWord = "";
   }

   public Word(String w)
   {
      theWord = w;
   }

   public void setWord(String w)
   {
      theWord = w;
   }

   public String toString()
   {
      return theWord;
   }
}