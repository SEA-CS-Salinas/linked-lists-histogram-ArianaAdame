package linkedlistshisto;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class HistoNode {
	private char letter;
	private int letterCount;
	private HistoNode next;

	/* Parameterized constructor 
	 * @param let	the character being referenced in the node
	 * @param cnt	how many times let occurs
	 * @param n 	the next node in the list */
	public HistoNode(char let, int cnt, HistoNode n) {
		letter = let;
		letterCount = cnt;
		next = n;
	}

	/* Returns letter 
	 * @return		let */
	public char getLetter() {
		return letter;
	}

	/* Returns letterCount 
	 * @return		letterCount */
	public int getLetterCount() {
		return letterCount;
	}

	/* Returns the next node in the list 
	 * @return		next */
	public HistoNode getNext() {
	   return next;
	}

	/* Changes the value of let 
	 * @param		new let value */
	public void setLetter(char let) {
		letter = let;
	}

	/* Changes the value of cnt 
	 * @param		new cnt value */
	public void setLetterCount(int cnt) {
		letterCount = cnt;
	}

	/* Changes the next node in the list 
	 * @param		new next node */
	public void setNext(HistoNode n) {
		next = n;
	}
	
}
