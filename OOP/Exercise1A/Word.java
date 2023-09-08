
package Exercise1A;

public class Word {
   public String word;

    public Word(String word) {
        this.word = word;
    }
    
    
    public void veryWord(){
        
        char[] characters = this.word.toCharArray();
        
        for (char c : characters) {
            System.out.println(c);
        }
    }
   
   
}
