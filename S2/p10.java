
public class Sentence
{
    String sentence;
    
    Sentence(String s){
        this.sentence = s;
    }
    void wordCount(){
        String[] words = sentence.split(" ");
        int count = words.length;
        System.out.println("total count of words in sentence are: " + count);
    }
    
	public static void main(String[] args) {
        Sentence s1 = new Sentence("hello world");
        s1.wordCount();
	}
}
