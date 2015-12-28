package concrete_classes;

import java.util.ArrayList;


public class Directory extends StorageElement
{
	private ArrayList<StorageElement> composants;
	
	//  Constructor.
	public Directory() {
		super(4);
	}
	
	
	@Override
	public int size() {
		int size=this.basicSize;
		for (StorageElement element : composants)
			size+=element.size();
		return size;
	}

	@Override
	public String absoluteAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ls() {
		// TODO Auto-generated method stub
		return null;
	}
	

	/* Getters/Setters */
	public ArrayList<StorageElement> getDirectories() {
		return composants;
	}
	public void setDirectories(ArrayList<StorageElement> composants) {
		this.composants = composants;
	}
}
