package oskerko.aggr_and_comp.task1;

import oskerko.aggr_and_comp.task1.word.Sentence;
import oskerko.aggr_and_comp.task1.word.Text;
import oskerko.aggr_and_comp.task1.word.Word;

public class Demo {

	public static void main(String[] args) {
		
		Word w1 = new Word("Я");
		Word w2 = new Word("учу");
		Word w3 = new Word("Java");
		Sentence sent1 = new Sentence();
		Sentence sent2 = new Sentence();
		Text text = new Text("Java");
		
		sent1.addWord(w1);
		sent1.addWord(w2);
		sent1.addWord(w3);
		
		sent2.addWord(w3);
		sent2.addWord(w1);
		sent2.addWord(w2);

		text.addSentence(sent1);
		text.addSentence(sent2);
		
		System.out.println(text);
		
		text.printTitle();
		text.printText();
		
		
	}

}
