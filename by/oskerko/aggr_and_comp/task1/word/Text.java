package oskerko.aggr_and_comp.task1.word;

import java.util.ArrayList;
import java.util.List;

public class Text {

	private List<Sentence> text = new ArrayList<Sentence>();
	private String title;

	public Text() {
	}
	
	public Text(String title) {
		this.title = title;
	}

	public Text(List<Sentence> text, String title) {
		this.text = text;
		this.title = title;
	}

	public void addSentence(Sentence sentence) {
		text.add(sentence);
	}

	public void removeSentence(Sentence sentence) {
		text.remove(sentence);
	}

	public void printText() {
		for (int i = 0; i < this.getText().size(); i++) {

			List<Word> l = this.getText().get(i).getSentence();
			for (int j = 0; j < l.size(); j++) {
				if (j != (l.size() - 1)) {
					System.out.print(l.get(j).getName() + " ");
				} else {
					System.out.print(l.get(j).getName() + ". ");
				}
			}
		}
	}
	
	public void printTitle() {
		System.out.println(this.title);
	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [text=" + text + "]";
	}

}
