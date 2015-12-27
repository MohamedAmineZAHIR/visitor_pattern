package concrete_classes;

import java.util.ArrayList;

public class Directory extends StorageElement
{
	private ArrayList<StorageElement> composants;
	
	//  Constructor.
	public Directory() {
		super(4);
	}
	
	/* Getters/Setters */
	public ArrayList<StorageElement> getDirectories() {
		return composants;
	}
	public void setDirectories(ArrayList<StorageElement> composants) {
		this.composants = composants;
	}
}
