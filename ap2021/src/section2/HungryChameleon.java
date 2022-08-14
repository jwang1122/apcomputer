package section2;

/**
 * http://www.cs.gettysburg.edu/~ilinkin/courses/Spring-2011/cs112/assignments/a4.html
 * http://www.cs.gettysburg.edu/~ilinkin/courses/Fall-2020/cs112/assignments/a4.html
 */
import java.util.ArrayList;

public class HungryChameleon extends ChameleonCritter {
	
	public static void main(String[] args) {
		// 1. generate list of Actor: actors
		ArrayList<Actor> actors = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			Bug b = new Bug(i); // All adjacent actors are bugs
			actors.add(b);
		}
		System.out.println(actors);
//		for (int i = 0; i < 4; i++) {
//			Actor b = new Actor(i);  // None of adjacent actors is Bug
//			actors.add(b);
//		}

		// 2. create an object of the HungryChameleon class
		HungryChameleon hc = new HungryChameleon(2);

		// 3. call the action method
		hc.processActors(actors);
		System.out.println(actors);
	}

	
	public HungryChameleon(int color) {
		this.color = color;
	}

	/**
	* Gets a list of adjacent bugs. 
	* @param actors the list of all adjacent neighbors 
	* @return a list of adjacent bugs 
	*/
	ArrayList<Bug> getBugs(ArrayList<Actor> actors) { /* to be implemented in part (a) */
		ArrayList<Bug> bugs = new ArrayList<>();
		for (Actor a : actors) {
			if (a instanceof Bug)   // not every adjacent actor is a bug
				bugs.add((Bug) a);
		}
		return bugs;
	}

	/**
	* Randomly "eats" one of the bugs in the list of bugs
	* Precondition: bugs.size() > 0. 
	* @param bugs the list of adjacent bugs 
	*/
	void eatBug(ArrayList<Bug> bugs) {
		/* to be implemented in part (b) */
		int index = (int) Math.random() * bugs.size();
		Bug b = bugs.get(index);
		// remove bug from the grid
		b.removeFromGrid();
	}

	/**
	* Gets a list of adjacent neighboring bugs and eats one.
	* If there are no bugs to eat, the HungryChameleon takes
	* on the color of a neighboring actor. 
	* @param actors the list of all adjacent neighbors 
	*/
	public void processActors(ArrayList<Actor> actors) {
		/* to be implemented in part (c) */
		this.adjacents = actors;
		ArrayList<Bug> bugList = getBugs(actors);
		if (bugList.size() == 0)
			super.processActors(actors);
		else
			eatBug(bugList);
	}

}

class Actor {
	protected int color;
	protected int x;
	protected int y;
	protected ArrayList<Actor> gridworld;
	
	public Actor() {
		
	}
	
	public Actor(int color) {
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Actor [color=" + color + ", gridworld=" + gridworld + "]";
	}
	
	
}

class Bug extends Actor {
	public Bug(int color) {
		this.color = color;
	}

	public void removeFromGrid() {
		System.out.println("Removed from the grid...");
		if(gridworld!=null && gridworld.contains(this)) {
			gridworld.remove(this);
		}
	}
}

class ChameleonCritter {

	protected int color;
	protected ArrayList<Actor> adjacents;
	
	// Don't care how
	public void processActors(ArrayList<Actor> actors) {
		System.out.println("Chameleon Critter Change its color...");
		for(Actor a: actors) {
			this.color = a.getColor();
			break;
		}
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

}
