package format;

public class Symbol {

	String letter;
	String subscript;
	String superscript;
	
	public Symbol(String letter){
		this.letter = letter;
	}
	public Symbol(String letter, String subscript, String superscript){
		this(letter);
		this.subscript = subscript;
		this.superscript = superscript;
	}
	
	
	
}
