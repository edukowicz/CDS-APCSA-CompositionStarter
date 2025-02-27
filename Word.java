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

   public int length() {
      return theWord.length();
   }

   public String substring(int x) {
      return theWord.substring(x);
   }

   public String substring (int x, int y) {
      return theWord.substring(x, y);
   }

   public int vowelCount(){
      int count = 0;
      String word2 = theWord.toLowerCase();
      for(int i = 0; i < word2.length(); i++) {
         if(word2.substring(i, i +1).equals("a") || word2.substring(i, i +1).equals("e")  || word2.substring(i, i +1).equals("i") || word2.substring(i, i +1).equals("o") || word2.substring(i, i +1).equals("u")) {
            count = count + 1;
         }
      }
      return count;
   }

   public String backwards() {
      String back = "";
      for(int i = theWord.length() ; i > 0; i--) {
         back = back + theWord.substring(i -1, i);
      }
      return back;
   }

   public String insertLetter(char c, int i) {
      String full = theWord.substring(0, i) + c + theWord.substring(i);
      return full;
   }

   public String toString()
   {
      return theWord;
   }
}