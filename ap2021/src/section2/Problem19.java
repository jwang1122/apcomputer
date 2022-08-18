package section2;

import java.util.ArrayList;
import java.util.List;

public class Problem19 {

	public static void main(String[] args) {
		MarbleCollection m = new MarbleCollection();
		m.addSet(new MarbleSet("red", 2));
		m.addSet(new MarbleSet("blue", 3));
		m.addSet(new MarbleSet("green", 3));
		m.addSet(new MarbleSet("blue", 4));
		m.addSet(new MarbleSet("red", 1));
		System.out.println(m);
		int removed = m.removeColor("red");
		System.out.printf("the total number of red marbles removed is %s.\n",removed);
		System.out.println(m);		
	}

}

class MarbleSet {
	private String color;
	private int numMarbles;

	/** Constructs a new MarbleSet object */
	public MarbleSet(String color, int numMarbles) {/* implementation not shown */
		this.color = color;
		this.numMarbles = numMarbles;
	}

	/**
	 * @return the color of the set of marbles
	 */
	public String getColor() {/* implementationnot shown */
		return color;
	}

	/**
	 * @return the number of marbles in the set
	 */
	public int getNumber() { /* implementationnot shown */
		return numMarbles;
	}

	@Override
	public String toString() {
		return "MarbleSet (" + color + ", " + numMarbles + ")";
	}

	
	// There may be instance variables, constructors, and methods that are not
	// shown.
}

class MarbleCollection {
	/** This is a list of all marble sets */
	private List<MarbleSet> sets;

	/** Constructs a new MarbleSet object */
	public MarbleCollection() {
		sets = new ArrayList<MarbleSet>();
	}

	/**
	 * Adds theSet to the marble collection
	 * 
	 * @param theSet the marble set to add to the marble collection
	 */
	public void addSet(MarbleSet theSet) {
		sets.add(theSet);
	}

	/**
	 * return the total number of marbles
	 */
	public int getTotalMarbles() { /* to be implemented in part (a) */
		int marbles = 0;
		for (MarbleSet m : sets) {
			marbles += m.getNumber();
		}
		return marbles;
	}

	/**
	 * Removes all the marble sets from the marble collection that have the same
	 * color as marbleColor and returns the total number of marbles removed
	 * 
	 * @param marbleColor the color of the marble sets to be removed
	 * @return the total number of marbles of marblecolor in the marble sets removed
	 */
	public int removeColor(String marbleColor) {/* to be implemented in part (b) */
		int num = 0;
		for (int i= sets.size()-1; i>=0; i--) { 
			MarbleSet m = sets.get(i);
			if (m.getColor().equals(marbleColor)) {
				num += m.getNumber();
				sets.remove(m);    // when there is remove, always start from end to beginning
			}
		}
		return num;
	}

	@Override
	public String toString() {
		return "MarbleCollection [sets=" + sets + "]";
	}
	
	
}