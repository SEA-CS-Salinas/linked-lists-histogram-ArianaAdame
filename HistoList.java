package linkedlistshisto;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.*;
import static java.lang.System.*;

public class HistoList {
	
	private HistoNode front;

	/* Non-parameterized constructor */
	public HistoList() {
		front = null;
	}
	
	/* Adds a new node to the front with the value of let if it doesn't already exist in the list
	 * If let already exists, then bump up the count 
	 * @parma let		character to check for */
	public void addLetter(char let) {
		int temp = indexOf(let);
		System.out.println(let + " " + temp);
		/* let doesn't exist */
		if (temp == -1) {
			System.out.println("doesn't exist");
			front = new HistoNode(let, 1, front);
		}
		/* let already exists */
		else {
			System.out.println("already exists");
			HistoNode current = front;
			for (int i = 0; i < temp; i++) {
				current = current.getNext();
			}
			current.setLetterCount(current.getLetterCount() + 1);
		}
	}

	/* Returns the index of let in the list if let exists, returns -1 otherwise
	 * @param let		the character to search the index of
	 * @return			position of let in the list, -1 if let doesn't exist */
	/* while index != target, add to index count, return indexcount */
	public int indexOf(char let) {
		HistoNode current = front;
		int indCount = 0;
		while (current != null) {
			if (current.getLetter() == let) {
				return indCount;
			}
			current = current.getNext();
			indCount++;
		}
		return -1;
	}

	/* Returns the node at the given index within the list
	 *  @param spot		the index to check
	 *  @return			the node at the given index */
	private HistoNode nodeAt(int spot) {
		HistoNode current = null;
		for (int i = 0; i < spot; i++) {
			current = front.getNext();
		}
		return current;
	}

	
	/* Prints the list
	 * @return			string with all the values in the list */
	public String toString() {
		String output = "";
		while (front != null) {
			output +=  front.getLetter() + " - " + front.getLetterCount() + "\t";
			front = front.getNext();
		}
		return output;
	}
	
}
