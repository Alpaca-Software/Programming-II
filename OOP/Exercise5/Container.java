package Exercise5;

public class Container {

    public final char[] vocales = {'a', 'e', 'o', 'u'};

    public String word;

    public Container(String word) {
        this.word = word;
    }

    public void veryWord() {
        int c = 0;
        int vocal = 0;

        int large = this.word.length();

        for (int i = 0; i < large; i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                vocal++;
            }else{
                c++;
            }

        }
        
        System.out.println("La cantidad de vocales que hay en la palabra  "+this.word+" is the "+vocal);
        
        System.out.println("La cantidad de consonantes que hay en la palabra  "+this.word+" is the "+c);
    }

}
