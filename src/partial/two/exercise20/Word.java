package partial.two.exercise20;

/*77*/
public class Word {

    private String word;

    public Word(String word) {
        this.setWord(word);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void showWordUpperCase() {

        int c = this.word.length();
        if(this.word != null && !this.word.isEmpty()){
            this.word = this.word.substring(0, 1).toUpperCase()+ this.word.substring(1, c-1)+this.word.substring(c-1, c).toUpperCase() ;
        }

        System.out.println(this.word);
      
    }

}
